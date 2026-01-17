/*Questão 14: Cálculo do Volume de um Cubo
 Implemente um programa em Java que receba o comprimento da aresta de um
 cubo e retorne seu volume. A fórmula do volume do cubo é: 𝑉 = 𝑎𝑟𝑒𝑠𝑡𝑎³. */

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual o comprimento da aresta do cubo?: ");
        double aresta = scanner.nextDouble();

        double volume = Math.pow(aresta, 3);

        System.out.println("O valor do volume do cubo é: " + volume);

        scanner.close();
    }
}
