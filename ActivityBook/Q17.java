import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        double novoSalario;
        double reajuste = 0;

        if (salario < 1100) {
            reajuste = 0.10;
        } else if (salario <= 2000) {
            reajuste = 0.07;
        } else {
            reajuste = 0.05;
        }
        novoSalario = salario + (salario * reajuste);
        System.out.printf("O reajuste foi de : %.0f%% e o novo salário ficou no valor de : R$ %.2f", reajuste * 100,
                novoSalario);
        scanner.close();
    }
}
