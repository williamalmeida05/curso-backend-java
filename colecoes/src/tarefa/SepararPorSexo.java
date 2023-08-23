package tarefa;
import java.util.ArrayList;
import java.util.Scanner;

public class SepararPorSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();

        System.out.print("Digite o número de pessoas: ");
        int numPessoas = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o próximo inteiro

        for (int i = 0; i < numPessoas; i++) {
            System.out.print("Digite o nome da pessoa: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o sexo (M/F) da pessoa: ");
            String sexo = scanner.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                masculino.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                feminino.add(nome);
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
