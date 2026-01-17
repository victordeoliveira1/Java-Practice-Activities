import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String produto = scanner.nextLine();
        System.out.print("Digite o valor atual do produto: ");
        double valor = scanner.nextDouble();

        double novoValor = valor - (valor * 0.045);
        System.out.printf("O produto %s agora irá custar : R$ %.2f", produto, novoValor);
        scanner.close();

    }
}
