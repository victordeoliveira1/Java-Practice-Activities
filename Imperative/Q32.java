/* Questão 32: Cálculo de Custo de um Produto I
 Faça um programa que receba o preço de custo de um produto e mostre o valor de
 venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com um
 percentual informado pelo usuário.*/

import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o preço de custo do produto: ");
        double valor = scanner.nextDouble();
        System.out.print("Digite o percentual de acréscimo ");
        double percentual = scanner.nextDouble();

        double valorFinal = valor + (valor * (percentual / 100));

        System.out.printf(
                "O valor de custo do produto é de : R$ %.2f%nO acréscimo é de : %.2f %%%nO valor final do produto é de : R$ %.2f",
                valor, percentual, valorFinal);

        scanner.close();
    }
}
