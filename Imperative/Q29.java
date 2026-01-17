/*Questão 29: Cálculo de Prestações
 A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações
 sem juros. Faça um programa que receba um valor de uma compra e mostre o valor
 das prestações. */

import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor das compras: ");
        double valor = scanner.nextDouble();

        double vPrestacoes = valor / 5;

        System.out.printf("O valor de cada prestação ficará em : R$ %.2f", vPrestacoes);

        scanner.close();
    }
}
