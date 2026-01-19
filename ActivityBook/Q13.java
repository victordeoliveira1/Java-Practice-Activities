import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do emprestimo: ");
        double emprestimo = scanner.nextDouble();
        System.out.print("Digite a quantidade de meses: ");
        int meses = scanner.nextInt();

        double valorFinal = emprestimo + (emprestimo * 5 * meses) / 100;
        System.out.printf("Total a ser pago : R$ %.2f", valorFinal);

        scanner.close();
    }
}
