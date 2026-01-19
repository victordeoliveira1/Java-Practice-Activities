import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Informe um segundo número inteiro: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;
        int sub = num1 - num2;
        int multi = num1 * num2;
        double div = (double) num1 / num2;

        System.out.println("Soma: " + soma + "\nSubtração: " + sub + "\nMultiplicação: " + multi + "\nDivisão: " + div);

        scanner.close();
    }
}
