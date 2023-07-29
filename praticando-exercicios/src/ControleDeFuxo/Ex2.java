//2.Escreva uma Programa que receba a idade de 3 pessoas, calcule e imprima a quantidade de pessoas maiores de idade (idade >= 18 anos).

package ControleDeFuxo;

import java.util.Scanner;


public class Ex2 {

   public static void main(String args[]){

       Scanner s = new Scanner(System.in);
       int totalPessoas = 3;
       int contagemMaioresIdade = 0;

       for(int i = 1; i <= totalPessoas; i++){
           System.out.println("Digite a idade da pessoa " + i + ": ");
           int idade = s.nextInt();

           if(idade >= 18){
               contagemMaioresIdade++;
           }

       }

       System.out.println("A quantidade de pessoas maiores de idade é: " + contagemMaioresIdade);

   }


}
