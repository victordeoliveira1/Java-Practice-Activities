import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome do curso: ");
        String curso = scanner.nextLine();
        System.out.print("Digite o valor atual do curso: ");
        double valor = scanner.nextDouble();

        double novoValor = valor * 1.075;
        System.out.printf("O curso: %s ficará com o valor de R$ %.2f", curso, novoValor);

        scanner.close();
    }
}
