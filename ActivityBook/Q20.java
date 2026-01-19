import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int v1 = scanner.nextInt();
        System.out.print("Digite o Segundo número: ");
        int v2 = scanner.nextInt();
        System.out.print("Digite o Terceiro número: ");
        int v3 = scanner.nextInt();

        int maior = v1;
        int menor = v1;
        if (v2 > maior) {
            maior = v2;
        }
        if (v3 > maior) {
            maior = v3;
        }
        if (v2 < menor) {
            menor = v2;
        }
        if (v3 < menor) {
            menor = v3;
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        scanner.close();
    }
}
