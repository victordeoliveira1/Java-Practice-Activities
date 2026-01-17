import java.util.Scanner;

public class Q19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double valor = scanner.nextDouble();

        if (valor > 500) {
            System.out.printf("Valor a Pagar: R$ %.2f ", (valor - (valor * 0.10)));
        } else {
            System.out.println("Item não tem desconto!");
        }

        scanner.close();
    }
}
