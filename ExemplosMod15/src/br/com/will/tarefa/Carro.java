package br.com.will.tarefa;

public abstract class Carro {

    private int potencia;
    private String fonteDeCombustivel;
    private String cor;

    public Carro(int potencia, String fonteDeCombustivel, String cor) {
        this.potencia = potencia;
        this.fonteDeCombustivel = fonteDeCombustivel;
        this.cor = cor;
    }

    public void ligarMotor(){
        System.out.println(getClass().getSimpleName());
        System.out.println("Está " + fonteDeCombustivel + "o motor foi ligado e está pronto para utilizar " + potencia + " cavalos de potencia");
    }

    public void limpar(){
        System.out.println("O carro foi limpo e o " + cor.toLowerCase() + " e a cor brilha");
    }

    public void checarMecanica(){
        System.out.println("O carro foi verificado pelo mecânico. Tudo parece bem!");
    }
    public void combustivel(){
        System.out.println("Carro com combustivel " + fonteDeCombustivel.toLowerCase());
    }
}
