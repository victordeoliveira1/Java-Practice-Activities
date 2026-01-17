/*Questão 26: Troca de Valores
 Faça um programa para ler dois valores nas variáveis A e B, e efetuar as trocas dos
 valores de forma que a variável A passe a possuir o valor da variável B e a variável
 B passe a possuir o valor da variável A. Apresentar os valores trocados */

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de A:");
        double a = scanner.nextDouble();
        System.out.print("Digite o valor de B:");
        double b = scanner.nextDouble();

        double backup = a;
        a = b;
        b = backup;

        System.out.println("O Novo valor de A é: " + a + "\nO novo valor de B é: " + b);

        scanner.close();
    }
}
