/* Questão 15: Cálculo do Volume de um Cone
 Implemente um programa em Java que receba o raio da base e a altura de um
 cone e retorne seu volume. A fórmula do volume do cone é: 𝑉 = 1 / 3 × 𝜋 × 𝑟² × ℎ */

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual é o raio da base do cone: ");
        double raio = scanner.nextDouble();

        System.out.print("Qual é a altura do cone: ");
        double altura = scanner.nextDouble();

        double volume = ((3.14 * Math.pow(raio, 2)) * altura) / 3;

        System.out.println("O valor do volume do cone é: " + volume);
        scanner.close();
    }

}
