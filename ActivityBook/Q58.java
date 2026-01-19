import java.util.Scanner;

public class Q58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra = "", invertida = "";

        System.out.print("Digite uma palavra para ver se é um Palíndromo: ");
        palavra = scanner.nextLine().toLowerCase();
        palavra = palavra.replace(" ", "");

        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida = invertida + palavra.charAt(i);
        }

        if (palavra.equals(invertida)) {
            System.out.println("É um Palíndromo");
        } else {
            System.out.println("Não É um Palíndromo");
        }
        
        scanner.close();
    }
}
