/* Questão 25: Calculadora II
 Faça umprograma que peça 2 números inteiros e um número real. Calcule e mostre:
 a. O produto do dobro do primeiro com metade do segundo.
 b. A soma do triplo do primeiro com o terceiro.
 c. O terceiro elevado ao cubo*/

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite 2 números inteiros e 1 real.\nNúmero inteiro 01:");
        int num1 = scanner.nextInt();
        System.out.print("Número inteiro 02:");
        int num2 = scanner.nextInt();
        System.out.print("Número real:");
        double numR = scanner.nextDouble();

        double respA = (num1 * 2) * ((double) num2 / 2);
        double respB = (num1 * 3) + numR;
        Double respC = Math.pow(numR, 3);

        System.out.println("Resposta A: " + respA + "\nResposta B: " + respB + "\nResposta C: " + respC);
        scanner.close();
    }
}
