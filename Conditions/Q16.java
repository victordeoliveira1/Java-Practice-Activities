import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        double a = scanner.nextDouble();
        if (a != 0) {
            System.out.print("Digite o valor de B: ");
            double b = scanner.nextDouble();
            System.out.print("Digite o valor de C: ");
            double c = scanner.nextDouble();

            double delta = Math.pow(b, 2) - 4 * a * c;

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else if (delta == 0) {
                System.out.println("A equação possui apenas uma raiz real.");
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("A equação possui duas raízes reais e o valor é: %.1f e %.1f", x1, x2);
            }
        } else {
            System.out.println("A equação não é de segundo grau");
        }

        scanner.close();
    }
}
