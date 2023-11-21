package tarefa.dao.generic;

import tarefa.domain.Chassi;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class GenericDAO<T extends Chassi> implements IGenericDAO<T> {



    protected Map<Class, Map<Long, T>> map;
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
        if (mapaInterno.containsKey(entity.getChassis())) {
            return false;
        }
        mapaInterno.put(entity.getChassis(), entity);
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
        T objetoCadastrado = mapaInterno.get(entity.getChassis());
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
