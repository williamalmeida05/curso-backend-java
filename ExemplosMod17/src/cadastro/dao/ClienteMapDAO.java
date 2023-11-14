package cadastro.dao;

import cadastro.dao.generic.GenericDAO;
import cadastro.domain.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ClienteMapDAO extends GenericDAO<Cliente> implements IClienteDAO {


    public ClienteMapDAO(){
        super();
        Map<Long, Cliente> mapaInterno= this.map.get(getTipoClasse());
        if(mapaInterno == null){
            mapaInterno = new HashMap<>();
            this.map.put(getTipoClasse(), mapaInterno);
        }
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualizarDados(Cliente cliente, Cliente entityCadastrado) {

        entityCadastrado.setNome(cliente.getNome());
        entityCadastrado.setTel(cliente.getTel());
        entityCadastrado.setNumero(cliente.getNumero());
        entityCadastrado.setEnd(cliente.getEnd());
        entityCadastrado.setCidade(cliente.getCidade());
        entityCadastrado.setEstado(cliente.getEstado());

    }

//    private Map<Long, Cliente> map;
//
//    public ClienteMapDAO() {
//        map = new TreeMap<>();
//    }
//
//    @Override
//    public Boolean cadastrar(Cliente cliente) {
//        if (map.containsKey(cliente.getCpf())) {
//            return false;
//        }
//
//        map.put(cliente.getCpf(), cliente);
//        return true;
//    }
//
//    @Override
//    public void excluir(Long cpf) {
//        Cliente clienteCadastrado = map.get(cpf);
//        map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
//    }
//
//    @Override
//    public void alterar(Cliente cliente) {
//        Cliente clienteCadastrado = map.get(cliente.getCpf());
//        clienteCadastrado.setNome(cliente.getNome());
//        clienteCadastrado.setTel(cliente.getTel());
//        clienteCadastrado.setNumero(cliente.getNumero());
//        clienteCadastrado.setEnd(cliente.getEnd());
//        clienteCadastrado.setCidade(cliente.getCidade());
//        clienteCadastrado.setEstado(cliente.getEstado());
//    }
//
//    @Override
//    public Cliente consultar(Long cpf) {
//        return this.map.get(cpf);
//    }
//
//    @Override
//    public Collection<Cliente> buscarTodos() {
//        return this.map.values();
//    }

}