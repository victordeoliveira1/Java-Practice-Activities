import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorVenda = 0, valorCusto = 0, lucro = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digite o valor de venda do produto %d: ", i);
            valorVenda = valorVenda + scanner.nextDouble();
            System.out.printf("Agora digite o valor de custo do produto %d: ", i);
            valorCusto = valorCusto + scanner.nextDouble();
        }
        lucro = valorVenda - valorCusto;
        System.out.printf("Lucro das Vendas: R$ %.2f%n", lucro);
        System.out.printf("O lucro foi de %.1f%%%n", ((valorVenda / valorCusto) - 1) * 100);
        System.out.printf("O lucro foi de %.1f%%%n", ((lucro / valorCusto) * 100));

        scanner.close();
    }
}
// 2600
// 3050