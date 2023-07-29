package switchcase;

import java.util.Scanner;

public class ExemploScanner {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = s.nextInt();
        System.out.println("Você tem " + idade + " anos.");

    }

}
