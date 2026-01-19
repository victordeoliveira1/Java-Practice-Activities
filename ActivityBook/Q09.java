import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do salário mínimo: ");
        double salario = scanner.nextDouble();
        System.out.print("Digite o consumo de energia em kw: ");
        double consumo = scanner.nextDouble();

        double valorConsumo = salario / 1000 * consumo;

        System.out.printf("Valor salário: R$ %.2f%nValor da conta: R$ %.2f%nValor com desconto: R$ %.2f%n", salario,
                valorConsumo, (valorConsumo * 0.85));

        scanner.close();
    }
}
