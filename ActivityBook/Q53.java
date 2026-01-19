import java.util.Scanner;

public class Q53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mesMenor = 0, mesMaior = 0;
        double menorValor = Double.MAX_VALUE, maiorValor = 0;

        for (int i = 01; i <= 12; i++) {
            System.out.printf("Digite o valor do mês %d: ", i);
            double valorTemp = scanner.nextDouble();
            if (valorTemp > maiorValor) {
                maiorValor = valorTemp;
                mesMaior = i;
            }
            if (valorTemp < menorValor) {
                menorValor = valorTemp;
                mesMenor = i;
            }
        }
        

        System.out.printf("Mês com Maior Venda : %02d - R$ %f%nMês com Menor Venda: %02d - R$ %f", mesMaior, maiorValor,
                mesMenor, menorValor);
        scanner.close();
    }
}
