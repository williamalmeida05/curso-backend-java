package cadastro.dao;

import cadastro.dao.generic.GenericDAO;
import cadastro.domain.Cliente;
import cadastro.domain.Produto;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ProdutoDAO extends GenericDAO<Produto> implements IProdutoDAO{

    public ProdutoDAO() {
        super();
        Map<Long, Produto> mapaInterno= this.map.get(getTipoClasse());
        if(mapaInterno == null){
            mapaInterno = new HashMap<>();
            this.map.put(getTipoClasse(), mapaInterno);
        }
    }

    @Override
    public Class<Produto> getTipoClasse() {
        return Produto.class;
    }

    @Override
    public void atualizarDados(Produto produto, Produto entityCadastrado) {

        entityCadastrado.setCodigo(produto.getCodigo());
        entityCadastrado.setNome(produto.getNome());

    }
}

//realizar os mesmo passos que foram realizado para o clienteMapDao

//fazer o atualizar

//quando executar terá que decidir entre cliente e produto. Realizar o direcionamento

