/*Questão 10: Cálculo do Volume de uma Esfera
 Implemente um programa em Java que receba o raio de uma esfera e retorne seu
 volume. A fórmula do volume de uma esfera é dado por: 𝑉 = 4 / 3 × 𝜋 × 𝑟³ */

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio da esfera:");
        double raio = scanner.nextDouble();

        double volume = (4 * 3.14) * (Math.pow(raio, 3)) / 3;

        System.out.println("O volume da esfera é:" + volume);
        scanner.close();
    }
}
