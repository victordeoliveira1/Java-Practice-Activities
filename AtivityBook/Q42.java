import java.util.Scanner;

public class Q42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        if (altura >= 1.5 && idade >= 12) {
            contador++;
        }
        if (altura >= 1.4 && idade >= 14) {
            contador++;
        }
        if (altura >= 1.7 && idade >= 16) {
            contador++;
        }
        System.out.println(contador);

        scanner.close();
    }
}
