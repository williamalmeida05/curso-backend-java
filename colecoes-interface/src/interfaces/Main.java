package interfaces;

public class Main {
    public static void main(String[] args) {
        ICaneta caneta = new CanetaEsferografica();
        caneta.escrever("Olá Will");
        caneta.escreverComumATodas();
        System.out.println(caneta.getCor());

        ICaneta giz = new Giz();
        giz.escrever("Olá Will");
        giz.escreverComumATodas();
        System.out.println(giz.getCor());

        Lapis lapis = new Lapis();
        lapis.escrever("Olá Will");
        lapis.escreverComumATodas();
        System.out.println(lapis.getCor());

        ICarro carro = new CarroPasseio();
        carro.andar();
        carro.parar();

        ICarro caminhao = new Caminhao();
        caminhao.andar();
        caminhao.parar();

    }
}