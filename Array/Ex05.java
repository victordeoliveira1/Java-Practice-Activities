
import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        
        ArrayList<Integer> verificados = new ArrayList<>();

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = scanner.nextInt();
        }
        for (int elem : numeros) {
            int contador = 0;
            for (int i : numeros) {
                if (i == elem) {
                    contador++;

                }
            }
            if (!verificados.contains(elem)) {
                verificados.add(elem);
                System.out.printf("O número: %d, apareceu %d vezes%n", elem, contador);
            }

        }

        scanner.close();
    }
}
