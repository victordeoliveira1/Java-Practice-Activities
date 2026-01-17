/*Questão 21: Quantidade de Latas de Tintas I
 Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho
 em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é
 de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18
 litros, que custam R$ 80,00. Informe ao usuário as quantidades de latas de tinta a
 serem compradas e o preço total */

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite quantos metros quadrados de parede a serem pintadas:");
        double metros = scanner.nextDouble();

        double litrosNecessarios = metros / 3;

        double totalLatas = Math.ceil(litrosNecessarios / 18);

        double precoTotal = totalLatas * 80;
        System.out.printf("Você precisa de %.2f litros de tinta, ou seja " + totalLatas
                + " latas de tinta e isso vai lhe custar R$ " + precoTotal,litrosNecessarios);

        scanner.close();
    }
}
