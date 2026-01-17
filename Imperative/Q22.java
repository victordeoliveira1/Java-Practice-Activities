/*Questão 22: Quantidade de Latas de Tintas II
 Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho
 em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é
 de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18
 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00. Informe
 ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3
 situações:
 ● Comprar apenas latas de 18 litros;
 ● Comprar apenas galões de 3,6 litros;
 ● Misturar latas e galões, de forma que o desperdício de tinta seja menor.
 Acrescente 10% de folga e sempre arredonde os valores para cima, isto é,
 considere latas cheias. */

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite quantos metros quadrados de paredes a serem pintados: ");
        double metros = scanner.nextDouble();

        double totalLitros = (metros / 6) * 1.1; // adiciona 10% de folga em litros
        double latas = Math.ceil(totalLitros / 18); // arredonda a quantidade de latas pra cima
        double galoes = Math.ceil(totalLitros / 3.6);// arredonda a quantidade de galões pra cima

        double misturaLatas = Math.floor(totalLitros / 18);// arredonda a quantidade de latas pra baixo
        double misturaGalaoes = Math.ceil((totalLitros % 18) / 3.6);    //primeiro calcula o resto de litros das latas, depois checa quantos galões precisa e no fim arredonda pra cima

        System.out.println("Apenas latas: " + latas + " latas e irá custar: R$" + (latas * 80));
        System.out.println("Apenas Galões: " + galoes + " galões e irá custar: R$" + (galoes * 25));
        System.out.println("Misturando: " + misturaLatas + " latas e " + misturaGalaoes + " Galões, oque irá custar: R$"
                + ((misturaLatas * 80) + (misturaGalaoes * 25)));

        scanner.close();
    }
}
