import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do primeiro produto: ");
        double v1 = scanner.nextDouble();
        System.out.print("Digite o valor do segundo produto: ");
        double v2 = scanner.nextDouble();
        System.out.print("Digite o valor do terceira produto: ");
        double v3 = scanner.nextDouble();

        if (v1 < v2 && v1 < v3) {
            System.out.printf("O primeiro produto é o mais barato e tem o valor de : %.2f", v1);
        } else if (v2 < v1 && v2 < v3) {
            System.out.printf("O segundo produto é o mais barato e tem o valor de : %.2f", v2);
        } else {
            System.out.printf("O terceiro produto é o mais barato e tem o valor de : %.2f", v3);
        }

        scanner.close();
    }
}
