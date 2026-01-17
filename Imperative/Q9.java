/*Questão 9: Conversão de Unidades (Temperatura)
 Faça um programa que peça a temperatura em graus Fahrenheit, transforme e
 mostre a temperatura em graus Celsius. C = 5 * ((F-32) / 9).
 A fórmula de conversão é: 𝐹 = 9 / 5 × 𝐶 + 32 */

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a temperatura em Fahrenheit:");
        double temp = scanner.nextDouble();

        double conversao = 5 * ((temp - 32) / 9);

        System.out.printf("A temperatura em Celsius é: %.1f", conversao);
        scanner.close();
    }
}
