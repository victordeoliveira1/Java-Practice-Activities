/*Questão 12: Cálculo do Volume de um Cilindro
 Implemente um programa em Java que receba o raio da base e a altura de um
 cilindro e retorne seu volume. A fórmula do volume do cilindro é: 𝑉 = 𝜋 × 𝑟² × ℎ. */

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio da base do cilindro:");
        double raio = scanner.nextDouble();

        System.out.print("Digite a altura do cilindro:");
        double altura = scanner.nextDouble();

        double volume = (3.14 * Math.pow(raio, 2)) * altura;
        System.out.println("o valor do volume do cilindro é: " + volume);

        scanner.close();
    }
}
