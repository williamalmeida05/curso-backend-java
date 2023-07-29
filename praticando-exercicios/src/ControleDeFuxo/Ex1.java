// 1.Faça uma Programa que receba um número inteiro, calcule e imprima a tabuada  desse número.

package ControleDeFuxo;

import java.util.Scanner;

public class Ex1 {

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        System.out.println("Informe um número para visualizar a tabuada: ");
        int num = s.nextInt();

         for(int i = 0; i <= 10; i++){
             System.out.println(num + "X" + i + " = " + num*i);
         }
        System.out.println("\nFim");
    }

}
