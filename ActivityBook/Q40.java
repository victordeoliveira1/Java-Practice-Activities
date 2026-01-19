import java.util.Scanner;

public class Q40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anoNovo = 0;
        double velocidadeMax = 0;
        double soma = 0;
        for (int i = 1; i <= 4; i++) {
            for (int c = 1; c <= 3; c++) {
                System.out.printf("Digite o ano do Carro %d do grupo %d: ", c, i);
                int ano = scanner.nextInt();
                System.out.printf("Digite a velocidade do Carro %d do grupo %d: ", c, i);
                double velocidade = scanner.nextDouble();
                if (ano > anoNovo) {
                    anoNovo = ano;
                }
                if (velocidade > velocidadeMax) {
                    velocidadeMax = velocidade;
                }
                soma = soma + velocidade;
            }
            System.out.printf("------------------Grupo %d-------------------%n", i);
            System.out.printf(
                    "Ano do carro mais novo = %d%nVelocidade do mais rápido = %.2f%nVelocidade média = %.2f%n",
                    anoNovo, velocidadeMax, (soma / 3));
            System.out.println("--------------------------------------------");
            anoNovo = 0;
            velocidadeMax = 0;
            soma = 0;
        }

        scanner.close();
    }
}
