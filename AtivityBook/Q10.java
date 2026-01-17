import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário: ");
        double salario = scanner.nextDouble();
        System.out.print("Digite a vantagem: ");
        double vantagem = scanner.nextDouble();
        System.out.print("Digite os descontos: ");
        double desconto = scanner.nextDouble();

        System.out.printf("Salário Líquido: R$ %.2f",(salario+vantagem-desconto));
        scanner.close();
    }
}
