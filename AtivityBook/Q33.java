import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double peso = 0;
        double menorPeso = 250;

        while (peso <= 200) {
            System.out.print("Digite um peso: ");
            peso = scanner.nextDouble();
            if (peso < menorPeso) {
                menorPeso = peso;
            }
        }
        System.out.printf("Menor_Peso = %.2f kg", menorPeso);

        scanner.close();
    }
}
