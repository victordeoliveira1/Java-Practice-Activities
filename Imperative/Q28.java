/* Questão 28: Cálculo de Rendimentos
 Faça um programa que receba um valor que foi depositado e exiba o valor com
 rendimento após um mês. Considere fixo o juro da poupança em 0,50% a.m.*/

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor a depositar: ");
        double valor = scanner.nextDouble();

        double aposRendimento = valor * 1.005;

        System.out.printf("Seu dinheiro após o rendimento ficou: %.2f", aposRendimento);

        scanner.close();
    }
}
