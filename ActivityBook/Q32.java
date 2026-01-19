import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        for (int i = 1; i <= 7; i++) {
            System.out.printf("Digite o total de vendas do dia %d: ", i);
            soma = soma + scanner.nextDouble();
        }
        System.out.printf("Total de Vendas R$ %.2f%n", soma);
        System.out.printf("Ticket médio: R$%.2f", (soma / 7));

        scanner.close();
    }
}
