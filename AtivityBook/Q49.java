import java.util.Scanner;

public class Q49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite valor antigo e valor novo: ");
            double valorAntigo = scanner.nextDouble();
            double valorNovo = scanner.nextDouble();

            if (valorAntigo > valorNovo) {
                System.out.println("Valores inválidos");
            } else {
                System.out.printf("%.0f%%%n", ((valorNovo / valorAntigo) - 1) * 100);
                break;
            }
        }

        scanner.close();
    }
}
