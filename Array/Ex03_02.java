import java.util.ArrayList;
import java.util.Scanner;

public class Ex03_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> frase = new ArrayList<>();
        ArrayList<Character> invertido = new ArrayList<>();

        System.out.println("Digite a palavra: ");
        String palavra = scanner.nextLine();

        for (int i = 0; i < palavra.length(); i++) {
            frase.add(palavra.charAt(i));
        }
        
        for (int i = frase.size() - 1; i >= 0; i--) {
            invertido.add(frase.get(i));
        }

        if (invertido.equals(frase)) {
            System.out.println("É um palíndromo");
        } else {
            System.out.println("Não é um palíndromo");
        }
        scanner.close();
    }
}
