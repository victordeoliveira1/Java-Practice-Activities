import java.util.Scanner;

public class Ex03_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "";
        String invertido = "";

        System.out.println("Digite uma palavra: ");
        nome = scanner.nextLine();
        //nome = nome.replace(" ", "");

        for (int i = nome.length() - 1; i >= 0; i--) {
            invertido = invertido + nome.charAt(i);
        }

        if (invertido.equals(nome)) {
            System.out.println("É um palíndromo");
        } else {
            System.out.println("Não é um palíndromo");
        }

        scanner.close();
    }
}
