package will.com.br.reflections.anotacao.cadastro.dao;

import will.com.br.reflections.anotacao.cadastro.dao.generic.IGenericDAO;
import will.com.br.reflections.anotacao.cadastro.domain.Cliente;

;


public interface IClienteDAO extends IGenericDAO<Cliente> {
    void atualiarDados(Cliente cliente, Cliente entityCadastrado);

    Cliente consultar(long l);

//    public Boolean cadastrar(Cliente cliente);
//
//    public void excluir(Long cpf);
//
//    public void alterar(Cliente cliente);
//
//    public Cliente consultar(Long cpf);
//
//    public Collection<Cliente> buscarTodos();
}