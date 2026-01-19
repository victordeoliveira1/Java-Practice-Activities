import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor = 0;
        double menorValor = 0;
        double maiorValor = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite a %dª venda: ", i);
            valor = scanner.nextDouble();
            if (menorValor == 0) {
                menorValor = valor;
            }
            if (valor > maiorValor) {
                maiorValor = valor;
            }
            if (valor < menorValor) {
                menorValor = valor;
            }
        }
        System.out.printf("Maior: %.2f%nMenor: %.2f", maiorValor, menorValor);

        scanner.close();
    }
}
