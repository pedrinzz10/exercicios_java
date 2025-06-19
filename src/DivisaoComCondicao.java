import java.util.Scanner;

public class DivisaoComCondicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pede o número inicial
        System.out.print("Digite o número base: ");
        int base = scanner.nextInt();

        while (true) {
            System.out.print("Digite um número (ou qualquer número não divisível para parar): ");
            int numero = scanner.nextInt();

            // Ignora números menores que a base
            if (numero < base) {
                System.out.println("Número ignorado (menor que a base).");
                continue;
            }

            // Verifica divisão
            if (numero % base != 0) {
                System.out.println("Número não é divisível. Encerrando.");
                break;
            }

            System.out.println("Número aceito (divisível por " + base + ").");
        }

        scanner.close();
    }
}
