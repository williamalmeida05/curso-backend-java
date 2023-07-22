
/*
* Realizar a leitura de quatro notas e calcular a média.
*/

public class ExercicioOperadores {

    public static void main(String args[]){
        lerNotas();
    }

    private static void lerNotas(){

        int nota1 = 10;
        int nota2 = 20;
        int nota3 = 30;
        int nota4 = 40;

        int resultado = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Resultado da média das quatro notas informadas: " + resultado);

    }
}
