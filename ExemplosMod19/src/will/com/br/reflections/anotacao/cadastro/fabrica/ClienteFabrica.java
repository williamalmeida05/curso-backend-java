package will.com.br.reflections.anotacao.cadastro.fabrica;

import will.com.br.reflections.anotacao.cadastro.domain.Cliente;
import will.com.br.reflections.anotacao.cadastro.domain.Persistente;

/**
 *
 * Classe que representa a cricação de objetos Cliente
 *
 */
public class ClienteFabrica implements FabricaPersistente{

    @Override
    public Persistente criarObjeto(String dadosSeparados[]) {
        return new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
    }
}