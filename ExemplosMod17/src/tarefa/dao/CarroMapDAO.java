package tarefa.dao;

import tarefa.dao.generic.GenericDAO;
import tarefa.domain.Carro;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CarroMapDAO extends GenericDAO<Carro> implements ICarroDAO {

    public CarroMapDAO(){
        super();
        Map<Long, Carro> mapaInterno= this.map.get(getTipoClasse());
        if(mapaInterno == null){
            mapaInterno = new HashMap<>();
            this.map.put(getTipoClasse(), mapaInterno);
        }
    }
    @Override
    public Class<Carro> getTipoClasse() {
        return Carro.class;
    }

    @Override
    public void atualizarDados(Carro carro, Carro entityCadastrado) {
        entityCadastrado.setCodChassi(carro.getCodChassi());
        entityCadastrado.setMarca(carro.getMarca());
        entityCadastrado.setMarca((carro.getMarca()));
    }

//    @Override
//    public Collection<Carro> buscarTodos() {
//        return null;
//    }


//    @Override
//    public Collection<Carro> buscarTodos() {
//        return null;
//    }

}
