import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.printf("O maior número é : %.2f", num1);
        } else {
            System.out.printf("O maior número é : %.2f", num2);

        }

        scanner.close();
    }

}