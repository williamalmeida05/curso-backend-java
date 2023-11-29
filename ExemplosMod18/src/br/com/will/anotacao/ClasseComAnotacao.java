package br.com.will.anotacao;

@PrimeiraAnotacao(value = "will", bairros = "Teste", numeroCasa = 10)
public class ClasseComAnotacao {

    @PrimeiraAnotacao(value = "Almeida", bairros = {"Teste", "Teste1"}, numeroCasa = 10, valores = 100d)
    private String nome;

    @PrimeiraAnotacao(value = "Rodrigo", bairros = "Teste", numeroCasa = 10)
    public ClasseComAnotacao(){

    }

}
