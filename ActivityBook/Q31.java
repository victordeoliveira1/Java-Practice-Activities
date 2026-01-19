import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        for (int i = numero; i <= numero + 6; i++) {
            System.out.println(i + ",");
        }

        scanner.close();
    }
}
