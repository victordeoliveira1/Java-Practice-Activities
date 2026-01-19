import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite as notas:");

        System.out.print("Nota01: ");
        double n1 = scanner.nextDouble();

        System.out.print("Nota02: ");
        double n2 = scanner.nextDouble();

        double media = (n1 + n2) / 2;

        System.out.printf("A média é: %.2f", media);

        scanner.close();
    }
}
