import java.util.Scanner;

public class Q39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número com 4 algarismos (0000): ");
        int num = scanner.nextInt();
        int invertido = 0;

        while (num > 0) {
            int ultimoDigito = num % 10;
            invertido = invertido * 10 + ultimoDigito;
            num = num / 10;
        }
        System.out.println(invertido);

        /*
         * String numTemp = "" + num;
         * String invertido = new StringBuilder(numTemp).reverse().toString();
         * int numInvertido = Integer.parseInt(invertido);
         * System.out.println(numInvertido);
         */

        scanner.close();
    }
}
