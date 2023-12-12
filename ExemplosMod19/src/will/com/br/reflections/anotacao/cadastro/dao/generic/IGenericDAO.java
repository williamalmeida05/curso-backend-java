package will.com.br.reflections.anotacao.cadastro.dao.generic;

import will.com.br.reflections.anotacao.cadastro.domain.Persistente;

import java.util.Collection;

public interface IGenericDAO <T extends Persistente>{

    public Boolean cadastrar(T entity);

    public void excluir(Long valor);

    public void alterar(T entity);

    public T consultar(Long valor);

    public Collection<T> buscarTodos();
}
