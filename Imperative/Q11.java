/*Questão 11: Cálculo da Área de um Triângulo
 Implemente um programa em Java que receba a base e a altura de um triângulo e
 imprima sua área. A fórmula da área do triângulo é dada por: 𝐴 = 𝑏𝑎𝑠𝑒 × 𝑎𝑙𝑡𝑢𝑟𝑎 / 2. */

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da base do triângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite o valor da altura do triângulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;
        System.out.println("A área do triângulo é: " + area);
        scanner.close();
    }
}
