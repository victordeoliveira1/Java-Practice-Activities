import java.util.Scanner;

class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da hora aula:");
        double vHora = scanner.nextDouble();
        System.out.print("Digite o total de horas no mês:");
        int tHoras = scanner.nextInt();

        System.out.printf("O salário no mês é de : R$ %.2f", (vHora * tHoras));
        scanner.close();
    }
}