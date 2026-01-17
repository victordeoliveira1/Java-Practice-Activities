/*Questão 31: Conversão de Unidades (Tempo)
 Faça um programa que leia a idade de uma pessoa expressa em anos, meses e dias
 e mostre-a expressa apenas em dias, suponha todos os meses com 30 dias. */

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite os meses: ");
        int meses = scanner.nextInt();
        System.out.print("Digite os dias: ");
        int dias = scanner.nextInt();

        int totalDias = (((idade * 12) + meses) * 30) + dias;

        System.out.println("O valor total em dias é de: " + totalDias);

        scanner.close();
    }
}
