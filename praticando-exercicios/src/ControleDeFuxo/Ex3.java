/*3.Escreva  uma  Programa  que  receba  a  idade  de  15  pessoas,  calcule  e  imprima:
    a quantidade  de  pessoas  em  cada  faixa  etária  e  a  porcentagem  de  cada  faixa  etária  em relação ao total de pessoas:
    As faixas etárias são •1 a 15 anos •16 a 30 anos •31 a 45 anos •46 a 60 anos
*/

package ControleDeFuxo;

import java.util.Scanner;

public class Ex3 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int pessoas = 5;
        double contadorIdade1 = 0;
        double contadorIdade2 = 0;
        double contadorIdade3 = 0;
        double contadorIdade4 = 0;


        for (int i = 1; i <= pessoas; i++){
            System.out.println("Informe a idade da " + i + "ª pessoa");
            int idade = s.nextInt();

            if(idade >= 1 && idade <= 15 ){
                contadorIdade1++;

            } else if(idade >= 16 && idade <= 30){
                contadorIdade2++;
            } else if (idade >= 31 && idade <= 45) {
                contadorIdade3++;
            } else {
                contadorIdade4++;
            }

        }

        System.out.println("Quantidade de pessoas entre 1 a 15 anos: " + contadorIdade1);
        System.out.println("Quantidade de pessoas entre 16 a 30 anos: " + contadorIdade2);
        System.out.println("Quantidade de pessoas entre 31 a 45 anos: " + contadorIdade3);
        System.out.println("Quantidade de pessoas entre 46 a 60 anos: " + contadorIdade4);

        System.out.println("\nSegue a porcentagem abaixo: ");

        double porcentagem1 = (pessoas * contadorIdade1)/100;
        double porcentagem2 = (pessoas * contadorIdade2)/100;
        double porcentagem3 = (pessoas * contadorIdade3)/100;
        double porcentagem4 = (pessoas * contadorIdade4)/100;

        System.out.println("A porcentagem de pessoas entre 1 a 15 anos são de " + porcentagem1 + " a cada " + pessoas + " pessoas");
        System.out.println("A porcentagem de pessoas entre 16 a 30 anos são de " + porcentagem2 + " a cada " + pessoas + " pessoas");
        System.out.println("A porcentagem de pessoas entre 31 a 45 anos são de " + porcentagem3 + " a cada " + pessoas + " pessoas");
        System.out.println("A porcentagem de pessoas entre 46 a 60 anos são de " + porcentagem4 + " a cada " + pessoas + " pessoas");

        System.out.println("\nFim!");
    }
}
