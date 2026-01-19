import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu salário: ");
        double salário = scanner.nextDouble();
        System.out.print("Digite o valor de vendas: ");
        double vendas = scanner.nextDouble();

        double novoSalario = salário + (vendas * 0.15);
        System.out.printf("R$ %.2f",novoSalario);

        scanner.close();
    }
}
