package br.com.will.tarefa;

public class FabricaSemContrato extends Fabrica{
    @Override
    Carro recuperarCarro(String solicitacaoDeNota) {
        if("A".equals(solicitacaoDeNota)){
            return new CarroPampa(100,"metade","branca");
        }else{
            return null;
        }
    }
}
