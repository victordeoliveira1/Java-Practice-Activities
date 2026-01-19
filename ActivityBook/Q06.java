import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o total percoridos em km: ");
        double km = scanner.nextDouble();

        System.out.print("Digite quantos litros foi gasto: ");
        double litros = scanner.nextDouble();

        double consumo = km / litros;

        System.out.printf("A distância percorrida por litro é de : %.3f km/l", consumo);
        scanner.close();

    }
}
