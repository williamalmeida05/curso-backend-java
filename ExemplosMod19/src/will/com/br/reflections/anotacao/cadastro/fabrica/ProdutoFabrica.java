package will.com.br.reflections.anotacao.cadastro.fabrica;


import will.com.br.reflections.anotacao.cadastro.domain.Persistente;
import will.com.br.reflections.anotacao.cadastro.domain.Produto;

/**
 *
 * Classe que representa a cricação de objetos Produto
 */
public class ProdutoFabrica implements FabricaPersistente {

    @Override
    public Persistente criarObjeto(String[] dados) {
        Produto produto = new Produto();
        produto.setCodigo(Long.parseLong(dados[0].trim()));
        produto.setNome(dados[1]);
        return produto;
    }
}