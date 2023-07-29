/*
* Fazer a leitura de notas do aluno e imprimir no console. Ler 4 notas e fazer a média.
*  Incluir condições da seguinte forma:
* Se a média for maior ou igual a 7, deve retornar como Aprovado.
* Se a média for maior ou igual a 5, deve retornar como Recuperação.
* Se a média for menor que 5, deve retornar como Reprovado
*/


package exercicio;

import java.util.Scanner;

public class CalcularMedia {

    public static void main(String args[]){

        System.out.println("**** Calcular Média do aluno ****");

        Scanner s = new Scanner(System.in);

        System.out.println("Informe a primeira nota do aluno: ");
        float nota1 = s.nextFloat();

        System.out.println("Informe a segunda nota: ");
        float nota2 = s.nextFloat();

        System.out.println("Informe a terceira nota: ");
        float nota3 = s.nextFloat();

        System.out.println("Informe a quarta nota: ");
        float nota4 = s.nextFloat();

        float media = ( nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média das 4 notas informadas é igual a: " + media);

        if (media >= 7){
            System.out.println("Aluno Aprovado");
        }
        else if (media >= 5) {
            System.out.println("Aluno em Recuperação");
        }
        else if (media <= 5){
            System.out.println("Aluno Reprovado");
        }

    }

}
