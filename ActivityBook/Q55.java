import java.util.Scanner;

public class Q55 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a frase: ");
        String frase = scanner.nextLine();

        String primeiros5 = "";
        String ultimos5 = "";
        String inverso = "";

        for (int i = 0; i < frase.length(); i++) {
            if (i < 5) {
                primeiros5 = primeiros5 + frase.charAt(i);
            }
            if (i >= frase.length() - 5) {
                ultimos5 = ultimos5 + frase.charAt(i);
            }
        }
        for (int i = primeiros5.length() - 1; i >= 0; i--) {
            inverso = inverso + primeiros5.charAt(i);
        }
        int total = frase.length();
        System.out.printf("A = %s%nB = %s%nC = %s%nD = %d%n",primeiros5,ultimos5,inverso,total);
        scanner.close();
    }
}
