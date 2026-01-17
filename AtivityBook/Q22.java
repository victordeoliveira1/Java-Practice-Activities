import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a renda do Homem: ");
        double RH = scanner.nextDouble();
        System.out.print("Digite a renda da Mulher: ");
        double RM = scanner.nextDouble();
        double RC = RH + RM;
        double ir = 0;

        if (RC <= 900) {
            ir = 0;
        } else if (RC < 1500) {
            ir = 0.10;
        } else if (RC < 2500) {
            ir = 0.15;
        } else {
            ir = 0.25;
        }

        System.out.printf(
                "%nRenda Conjunta: R$ %.2f%nPercentual do IR: %.0f%%%nValor do IR: R$ %.2f%nRenda Líquida: R$ %.2f%n", RC,
                (ir * 100), (RC * ir), (RC - (RC * ir)));
        scanner.close();
    }
}
