import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valores = 0;
        double valoresPares = 0;
        int soma = 0;
        double somaPares = 0;
        while (true) {
            System.out.print("Digite um número:");
            int num = scanner.nextInt();
            if (num == 999) {
                break;
            }
            if (num % 2 == 0) {
                somaPares += num;
                valoresPares++;
            }
            soma += num;
            valores++;
        }
        System.out.printf("Qtd. de valores = %d%nSoma dos valores = %d%nMédia dos valores pares = %.3f", valores, soma,
                (double) (somaPares / valoresPares));

        scanner.close();
    }
}
