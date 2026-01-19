import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do 1º produto: ");
        double produto1 = scanner.nextDouble();
        System.out.print("Digite o valor do 2º produto: ");
        double produto2 = scanner.nextDouble();
        System.out.print("Digite o valor do 3º produto: ");
        double produto3 = scanner.nextDouble() / 2;

        System.out.printf("Valor da compra = R$ %.2f", (produto1 + produto2 + produto3));
        scanner.close();
    }
}
