/*1ªpart: Ler no console nome de pessoas separadas por vírgula, e depois separar os valores que foram lidos, guardar
* em uma variavel, ordenar por ordem alfabetica e depois imprimir no console
* */
/*2ªpart: Ler no console "Nome - Sexo", imprimir o grupo de pessoas do sexo masculino e feminino*/



package tarefa2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class SeparGrupo {
    public static void main(String args[]) {
        separEOrdenar();
        separPorGrupo();
    }

    private static void  separEOrdenar(){
        System.out.println(" *********** Separar as pessoas da vírgula e ordenar pela ordem alfabética *********** \n");

        System.out.println("Informe o nome de pessoas, separando por vírgulas: ");
        Scanner s = new Scanner(System.in);

        String pessoas = s.nextLine();

        String[] partes = pessoas.split(",");

        Arrays.sort(partes);

        for (String parte : partes) {
            System.out.println(parte);
        }

        s.nextLine();

    }


    private static void separPorGrupo(){
        System.out.println(" *********** Separar dois grupos, masculino e feminino *********** \n");
        Scanner s = new Scanner(System.in);
        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();

        System.out.println("Informe o número de pessoas: ");
        int numPessoas = s.nextInt();
        s.nextLine();

        for (int i = 0; i < numPessoas; i++) {

            System.out.println("Informe o nome: ");
            String nome = s.nextLine();

            System.out.println("Informe o sexo: ");
            String sexo = s.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                masculino.add(nome + " - " + sexo);
            } else if (sexo.equalsIgnoreCase("F")) {
                feminino.add(nome + " - " + sexo);
            } else {
                System.out.println("Sexo inválido. Use 'M' para masculino e 'F' para feminino.");
            }
        }

        System.out.println("Grupo Masculino:");
        for (String nome : masculino) {
            System.out.println(nome);
        }

        System.out.println("Grupo Feminino:");
        for (String nome : feminino) {
            System.out.println(nome);
        }

    }


}

