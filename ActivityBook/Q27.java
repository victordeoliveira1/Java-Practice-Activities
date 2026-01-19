import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();
        String conceito = "";

        if (nota >= 9) {
            conceito = "A";
        } else if (nota >= 8) {
            conceito = "B";
        } else if (nota >= 7) {
            conceito = "C";
        } else {
            conceito = "D";
        }
        System.out.printf("Conceito %s", conceito);
        scanner.close();
    }
}
