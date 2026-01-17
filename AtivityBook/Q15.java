import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor hora: ");
        double vhora = scanner.nextDouble();
        System.out.print("Digite a distancia: ");
        double distancia = scanner.nextDouble();
        System.out.print("Digite o total de horas: ");
        int horas = scanner.nextInt();

        double valorShow = (vhora * horas) + (50 * distancia);
        double valorFrete = (50 * distancia) * 0.35;

        System.out.printf("Valor do show : R$ %.2f%nValor do Frete: R$ %.2f", valorShow, valorFrete);

        scanner.close();
    }
}
