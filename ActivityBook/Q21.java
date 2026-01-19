import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int v1 = scanner.nextInt();
        System.out.print("Digite o Segundo número: ");
        int v2 = scanner.nextInt();
        System.out.print("Digite o Terceiro número: ");
        int v3 = scanner.nextInt();

        int menor = v1;
        int medio = v1;
        int maior = v1;

        if (v2 < menor) {
            menor = v2;
        }
        if (v3 < menor) {
            menor = v3;
        }
        if (v2 > maior) {
            maior = v2;
        }
        if (v3 > maior) {
            maior = v3;
        }

        if (v2 > menor && v2 < maior) {
            medio = v2;
        }
        if (v3 > menor && v3 < maior) {
            medio = v3;
        }

        System.out.println("Ordem Crescente " + menor + " , " + medio + " , " + maior);

        scanner.close();
    }
}
