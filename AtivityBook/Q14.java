import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário bruto: ");
        double salarioBruto = scanner.nextDouble();

        double ir = salarioBruto*0.05;
        double inss = salarioBruto*0.11;
        double salarioFinal = salarioBruto-ir-inss;

        System.out.printf("Valor IR : R$ %.2f%nValor do INSS: R$ %.2f%nSalário Líquido: R$ %.2f",ir,inss,salarioFinal);
        scanner.close();
    }
}
