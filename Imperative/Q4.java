/*Questão 4: Média de Notas Bimestrais
 Faça um programa que peça as 4 notas bimestrais de um aluno e imprima a média */
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite 4 notas para calcular a média.");

        System.out.print("Nota 01: ");
        double n1 = scanner.nextDouble();

        System.out.print("Nota 02: ");
        double n2 = scanner.nextDouble();

        System.out.print("Nota 03: ");
        double n3 = scanner.nextDouble();

        System.out.print("Nota 04: ");
        double n4 = scanner.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;

        System.out.printf("A média das notas é: %.2f", media);
        
        scanner.close();
    }
}
