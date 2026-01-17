import java.util.Scanner;

public class Q54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qt = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digite a frase numero %d: ", i);
            String frase = scanner.nextLine().toLowerCase();
            for (int j = 0; j < frase.length(); j++) {
                if (frase.charAt(j) == 'a') {
                    qt++;
                }
            }
        }
        System.out.printf("%d Letras \"A\" ou \"a\"", qt);
        scanner.close();
    }
}
