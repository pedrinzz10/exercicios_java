import java.util.Scanner;

public class CalculadoraDeIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Informe seu peso");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("seu imc é de %s \n", imc);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do seu peso ideal");

        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Você está no peso ideal");

        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");

        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade grau 1");

        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade grau 2 (severa)");

        } else if (imc >= 40) {
            System.out.println("Obesidade grau 3 (mórbida)");
        }
    }
}
