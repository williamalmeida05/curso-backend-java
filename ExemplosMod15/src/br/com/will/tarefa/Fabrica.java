package br.com.will.tarefa;

public abstract class Fabrica {
    public Carro create(String solicitacaoDeNota){
        Carro carro = recuperarCarro(solicitacaoDeNota);
        carro = prepareCarro(carro);
        return carro;
    }
    private Carro prepareCarro(Carro carro){
        carro.limpar();
        carro.checarMecanica();
        carro.combustivel();
        return carro;
    }
    abstract Carro recuperarCarro(String solicitacaoDeNota);
}
