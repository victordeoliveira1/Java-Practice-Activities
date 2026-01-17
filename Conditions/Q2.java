import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double num = scanner.nextDouble();

        if (num >= 0) {
            System.out.print("O número é positivo");
        } else {
            System.out.print("O número é negativo");

        }
        scanner.close();
    }
}
