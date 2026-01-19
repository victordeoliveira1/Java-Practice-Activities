import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        int valor = scanner.nextInt();

        int n100 = valor / 100;
        valor = valor % 100;
        int n50 = valor / 50;
        valor = valor % 50;
        int n20 = valor / 20;
        valor = valor % 20;
        int n10 = valor / 10;
        valor = valor % 10;
        int n5 = valor / 5;
        valor = valor % 5;
        int n2 = valor / 2;
        valor = valor % 2;
        int n1 = valor / 1;
        valor = valor % 1;

        System.out.printf("%d notas de R$ 100%n", n100);
        System.out.printf("%d notas de R$ 50%n", n50);
        System.out.printf("%d notas de R$ 20%n", n20);
        System.out.printf("%d notas de R$ 10%n", n10);
        System.out.printf("%d notas de R$ 5%n", n5);
        System.out.printf("%d notas de R$ 2%n", n2);
        System.out.printf("%d notas de R$ 1%n", n1);

        scanner.close();
    }
}
