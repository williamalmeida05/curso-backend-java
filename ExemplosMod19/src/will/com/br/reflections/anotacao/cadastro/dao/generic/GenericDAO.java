package will.com.br.reflections.anotacao.cadastro.dao.generic;

import will.com.br.reflections.anotacao.cadastro.SingletonMap;
import will.com.br.reflections.anotacao.cadastro.anotacao.TipoChave;
import will.com.br.reflections.anotacao.cadastro.domain.Persistente;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;

public abstract class GenericDAO<T extends Persistente> implements IGenericDAO<T>{

//    protected Map<Class, Map<Long, T>> map; //quero criar um banco de dados generico que vai ser no map.

    private final SingletonMap singletonMap;
    public abstract Class<T> getTipoClasse();

    public abstract void atualizarDados(T entity, T entityCadastrado);

    public GenericDAO(){this.singletonMap = SingletonMap.getInstance();}

    public Long getChave(T entity){
        Field[] fields = entity.getClass().getDeclaredFields();
        for(Field field : fields){
            if(field.isAnnotationPresent(TipoChave.class)){
                TipoChave tipoChave = field.getAnnotation(TipoChave.class);
                String nomeMetodo = tipoChave.value();
                try {
                    Method method = entity.getClass().getMethod(nomeMetodo);
                    Long value = (Long) method.invoke(entity);
                    return value;
                } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return null;

    }

    @Override
    public Boolean cadastrar(T entity) {
//        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        Map<Long, T> mapaInterno = (Map<Long,T>) this.singletonMap.getMap().get(getTipoClasse());
        Long chave = getChave(entity);
        if (mapaInterno.containsKey(chave)) {
            return false;
        }
        mapaInterno.put(chave, entity);
        return true;
    }

    @Override
    public void excluir(Long valor) {
//        Map<Long, T> mapaInterno= this.map.get(getTipoClasse());
        Map<Long, T> mapaInterno = (Map<Long,T>) this.singletonMap.getMap().get(getTipoClasse());
        T objetoCadastrado = mapaInterno.get(valor);
        if(objetoCadastrado != null){
            mapaInterno.remove(valor, objetoCadastrado);
        }

    }

    @Override
    public void alterar(T entity) {
//        Map<Long, T> mapaInterno= this.map.get(getTipoClasse());
        Map<Long, T> mapaInterno = (Map<Long,T>) this.singletonMap.getMap().get(getTipoClasse());
        Long chave = getChave(entity);
        T objetoCadastrado = mapaInterno.get(chave);
        if(objetoCadastrado != null){
            atualizarDados(entity, objetoCadastrado);
        }
    }

    @Override
    public T consultar(Long valor) {
//        Map<Long, T> mapaInterno= this.map.get(getTipoClasse());
        Map<Long, T> mapaInterno = (Map<Long,T>) this.singletonMap.getMap().get(getTipoClasse());
        return mapaInterno.get(valor);
    }

    @Override
    public Collection<T> buscarTodos() {
//        Map<Long, T> mapaInterno= this.map.get(getTipoClasse());
        Map<Long, T> mapaInterno = (Map<Long,T>) this.singletonMap.getMap().get(getTipoClasse());
        return mapaInterno.values();
    }
}
