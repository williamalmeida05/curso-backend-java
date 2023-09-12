package br.com.will.tarefa;

import org.w3c.dom.ls.LSOutput;

public class FabricaContratada extends Fabrica{
    @Override
    Carro recuperarCarro(String solicitacaoDeNota) {
        if("A".equals(solicitacaoDeNota)){
            return new CarroFusca(150,"cheio","vermelho");
            }else{
                return null;
            }
        }
    }
