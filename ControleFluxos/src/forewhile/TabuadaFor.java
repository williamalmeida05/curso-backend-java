package forewhile;

import java.util.Scanner;

public class TabuadaFor {
    public static void main(String args[]){

        System.out.println("Digite um número para iniciar a tabuada: ");
        Scanner s = new Scanner(System.in);
        int numero = s.nextInt();
        for(int i = 0; i <= 10; i++){

            System.out.println(numero + "x" + i + " = " + numero*i);

        }
    }
}
