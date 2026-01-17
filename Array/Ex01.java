import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = scanner.nextInt();
        }
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.printf("%d%n", numeros[i]);
        }
        scanner.close();
    }
}
