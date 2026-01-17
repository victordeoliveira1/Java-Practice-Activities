/* Questão 19: Multa sobre o Excesso
 João Papo-de-Pescador, homem de bem, comprou um microcomputador para
 controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de
 peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo
 (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que
 você faça um programa que leia a variável peso (peso de peixes) e calcule o
 excesso.
 Gravar na variável excesso a quantidade de quilos além do limite e na variável
 multa o valor da multa que João deverá pagar. Imprima os dados do programa com
 as mensagens adequadas. */

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o peso dos peixes: ");
        double peso = scanner.nextDouble();

        double excesso = Math.max(0, (peso - 50));
        double multa = Math.max(0, excesso * 4);

        System.out.println("O excesso quilos de peixe é: " + excesso + "kg e o valor da multa será de: R$ " + multa);

        scanner.close();
    }
}
