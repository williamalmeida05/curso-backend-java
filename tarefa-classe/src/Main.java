public class Main {
    public static void main(String[] args) {

        System.out.println("É a mainstreet!");

        Gravadora gravadora = new Gravadora();

        gravadora.nome = ("PB Records");

        System.out.println(gravadora.nome);


        System.out.println(gravadora.informarCidade());

    }
}