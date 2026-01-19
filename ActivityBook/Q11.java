import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de apartamentos: ");
        int apartamentos = scanner.nextInt();
        System.out.print("Digite o valor da conta de energia: ");
        double energia = scanner.nextDouble();
        System.out.print("Digite o valor da conta de água: ");
        double agua = scanner.nextDouble();

        double rateio = (energia + agua) / apartamentos;
        System.out.printf("Valor Rateio - R$ %.2f", rateio);

        scanner.close();
    }
}
