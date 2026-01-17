
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] ordenado = new int[10];
        int menor = Integer.MAX_VALUE;
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = scanner.nextInt();
        }
        while (contador < numeros.length) {
            int index = 0;
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] < menor) {
                    menor = numeros[i];
                    index = i;
                }
            }
            numeros[index] = Integer.MAX_VALUE;
            ordenado[contador] = menor;
            menor = Integer.MAX_VALUE;
            contador++;
        }

        for (int i : ordenado) {
            System.out.printf("%d%n", i);
        }

        scanner.close();
    }
}
