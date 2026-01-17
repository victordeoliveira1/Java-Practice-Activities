import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade em estoque: ");
        int produto = scanner.nextInt();

        if (produto < 10) {
            System.out.println("O produto precisa ser reabastecido");
        } else {
            System.out.println("Estoque suficiente");
        }

        scanner.close();
    }
}
