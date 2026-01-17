import java.util.Scanner;

public class Q43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int medicao = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.printf("Digite a %dº medição: ", i);
            medicao = scanner.nextInt();
            soma += medicao;
            if (medicao < 110) {
                System.out.printf("%d NORMAL%n", medicao);
            } else if (medicao < 125) {
                System.out.printf("%d ALTERADA%n", medicao);
            } else {
                System.out.printf("%d MUITO ALTA%n", medicao);
            }
        }
        System.out.printf("MÉDIAS DAS LEITURAS = %.2f%n", (soma / 4));

        scanner.close();
    }
}
