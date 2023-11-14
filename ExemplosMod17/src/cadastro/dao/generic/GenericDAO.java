package cadastro.dao.generic;

import cadastro.domain.Cliente;
import cadastro.domain.Persistente;
import cadastro.domain.Produto;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class GenericDAO<T extends Persistente> implements IGenericDAO<T>{

    protected Map<Class, Map<Long, T>> map; //quero criar um banco de dados generico que vai ser no map.

    public abstract Class<T> getTipoClasse();

    public abstract void atualizarDados(T entity, T entityCadastrado);

    public GenericDAO(){
        if(this.map == null){
            this.map = new HashMap<>();

        }
    }

    @Override
    public Boolean cadastrar(T entity) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        if (mapaInterno.containsKey(entity.getCodigo())) {
            return false;
        }
        mapaInterno.put(entity.getCodigo(), entity);
        return true;
    }

    @Override
    public void excluir(Long valor) {
        Map<Long, T> mapaInterno= this.map.get(getTipoClasse());
        T objetoCadastrado = mapaInterno.get(valor);
        if(objetoCadastrado != null){
            this.map.remove(valor, objetoCadastrado);
        }

    }

    @Override
    public void alterar(T entity) {
        Map<Long, T> mapaInterno= this.map.get(getTipoClasse());
        T objetoCadastrado = mapaInterno.get(entity.getCodigo());
        if(objetoCadastrado != null){
            atualizarDados(entity, objetoCadastrado);
        }
    }

    @Override
    public T consultar(Long valor) {
        Map<Long, T> mapaInterno= this.map.get(getTipoClasse());
        return mapaInterno.get(valor);
    }

    @Override
    public Collection<T> buscarTodos() {
        Map<Long, T> mapaInterno= this.map.get(getTipoClasse());
        return mapaInterno.values();
    }
}
