import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o peso pescado: ");
        double peso = scanner.nextDouble();

        if (peso > 50) {
            double excesso = peso - 50;
            double multa = excesso * 4;
            System.out.printf("O excesso foi de %.3f kg e a multa foi de R$: %.2f", excesso, multa);
        } else {
            System.out.println("Peso ok!");
        }
        scanner.close();
    }
}
