package tarefa.dao.generic;

import tarefa.domain.Chassi;

import java.util.Collection;

public interface IGenericDAO<T extends Chassi> {


    public Boolean cadastrar(T entity);

    public void excluir(Long valor);
    public void alterar(T entity);
    public T consultar(Long valor);
    public Collection<T> buscarTodos();

}
