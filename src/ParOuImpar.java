import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos números
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número (maior que o primeiro): ");
        int num2 = scanner.nextInt();

        // Validação
        if (num2 <= num1) {
            System.out.println("Erro: o segundo número deve ser maior que o primeiro.");
            return;
        }

        // Escolha do tipo (par ou ímpar)
        scanner.nextLine(); // limpar o buffer
        System.out.print("Deseja ver os números pares ou ímpares? (par/impar): ");
        String escolha = scanner.nextLine().toLowerCase();

        // Impressão dos números em ordem decrescente
        System.out.println("\nNúmeros " + escolha + " entre " + num1 + " e " + num2 + " (ordem decrescente):");

        for (int i = num2; i >= num1; i--) {
            if (escolha.equalsIgnoreCase("par") && i % 2 == 0) {
                System.out.print(i + " ");
            } else if (escolha.equalsIgnoreCase("impar") && i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
