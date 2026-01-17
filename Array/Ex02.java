import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = scanner.nextInt();
        }
        for (int i : numeros) {
            soma += i;
        }
        System.out.printf("A soma é %d, e a média é: %d", soma, (soma / numeros.length));

        scanner.close();
    }
}
