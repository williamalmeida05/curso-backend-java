package will.com.br.reflections.anotacao.cadastro;

import java.util.HashMap;
import java.util.Map;

/*
* Classe Singleton que garante que o <code>map</code> serpa único em toda a vita da aplicação
* */
public class SingletonMap {

    private static SingletonMap singletonMap;
    /*
    * Contém todos os registros da aplicação.
    * Simula o banco de dados
    * */
    protected Map<Class, Map<Long,?>>map;

    private SingletonMap(){
        map = new HashMap<>();
    }

    /*
    * Método que garente o retorno de apenas uma instância desse objeto
    *
    * @return SinglenMap
    * */
    public static SingletonMap getInstance(){
        if(singletonMap == null){
            singletonMap = new SingletonMap();
        }
        return singletonMap;
    }

    public Map<Class, Map<Long, ?>> getMap(){
        return this.map;
    }
}
