/*  Questão 24: Calculadora I
 Faça um programa que receba dois números e ao final mostre a soma, subtração,
 multiplicação e a divisão dos números lidos.*/

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite dois números para os cálculos.\nNúmero 01: ");
        double num1 = scanner.nextDouble();

        System.out.print("Número 02: ");
        double num2 = scanner.nextDouble();

        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        System.out.println("Divisão: " + (num1 / num2));
        
        

        scanner.close();
    }
}
