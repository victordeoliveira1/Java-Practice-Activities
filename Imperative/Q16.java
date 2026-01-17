/*Questão 16: Conversor de Unidade (Peso)
 Implemente um programa em Java que receba um valor em quilogramas e retorne
 o valor equivalente em libras. Considere que 1 kg é equivalente a 2,20462 libras. */

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um peso em Kg:");
        double kg = scanner.nextDouble();

        double resultado = kg * 2.20462;

        System.out.printf("O valor de " + kg + "kg em libras é: %.2f libras", resultado);

        scanner.close();
    }
}
