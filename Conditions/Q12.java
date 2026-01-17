import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da hora: ");
        double vHora = scanner.nextDouble();
        System.out.print("Digite quantas horas trabalhadas: ");
        int horas = scanner.nextInt();

        double salarioBruto = horas * vHora;
        double desconto = 0;
        if (salarioBruto <= 900) {
            desconto = 0;
        } else if (salarioBruto <= 1500) {
            desconto = 0.05;
        } else if (salarioBruto <= 2500) {
            desconto = 0.10;
        } else {
            desconto = 0.20;
        }

        double totalDescontos = salarioBruto * (desconto + 0.10); // 10% de inss

        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.printf("Salário bruto: R$ %.2f * %d = R$ %.2f%n", vHora, horas, salarioBruto);
        System.out.printf("(-) IR(%.0f%%)) : R$ %.2f%n", (desconto * 100), (salarioBruto * desconto));
        System.out.printf("(-) INSS(10%%)) : R$ %.2f%n", (salarioBruto * 0.10));
        System.out.printf("(-) FGTS(11%%)) : R$ %.2f%n", (salarioBruto * 0.11));
        System.out.printf("Total de descontos: R$: %.2f%n", totalDescontos);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);

        scanner.close();
    }
}
