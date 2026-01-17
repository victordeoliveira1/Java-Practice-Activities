import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite nota 01: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite nota 02: ");
        double nota2 = scanner.nextDouble();
        double media = (nota1 + nota2) / 2;

        char conceito='.';
        String resultado = "";

        if (media < 4) {
            conceito = 'E';
        } else if (media < 6) {
            conceito = 'D';
        } else if (media < 7.5) {
            conceito = 'C';
        } else if (media < 9.0) {
            conceito = 'B';
        } else if (media <= 10) {
            conceito = 'A';
        }

        if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
            resultado = "Aprovado";
        } else {
            resultado = "Reprovado";
        }

        System.out.printf("Nota 1 = %.2f, Nota 2 = %.2f, Média: %.2f, Conceito: \"%s\", %s ", nota1, nota1, media, conceito,
                resultado);
        scanner.close();
    }
}
