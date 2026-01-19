import java.util.Scanner;

public class Q57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digite a placa numero %d: ", i);
            String placa = scanner.next();
            for (int j = 0; j < placa.length(); j++) {
                if (j == 3 || j == 5 || j == 6) {
                    String character = "";
                    character = character + placa.charAt(j);
                    valor += Integer.parseInt(character);
                }
            }
            System.out.println(valor);
            valor = 0;

        }
        scanner.close();
    }
}
