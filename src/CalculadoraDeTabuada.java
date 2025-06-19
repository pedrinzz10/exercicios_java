import java.util.Scanner;

public class CalculadoraDeTabuada {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe um número pára calcular sua tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("os resultados do seu número são estes:     ");
        System.out.printf("%s * 1 = %s \n", numero, numero);
        System.out.printf("%s * 2 = %s \n", numero, numero * 2);
        System.out.printf("%s * 3 = %s \n", numero, numero * 3);
        System.out.printf("%s * 4 = %s \n", numero, numero * 4);
        System.out.printf("%s * 5 = %s \n", numero, numero * 5);
        System.out.printf("%s * 6 = %s \n", numero, numero * 6);
        System.out.printf("%s * 7 = %s \n", numero, numero * 7);
        System.out.printf("%s * 8 = %s \n", numero, numero * 8);
        System.out.printf("%s * 9 = %s \n", numero, numero * 9);
        System.out.printf("%s * 10 = %s \n", numero, numero * 10);
    }
}