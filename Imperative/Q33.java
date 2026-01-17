/* Questão 33: Cálculo de Custo de um Produto II
 O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
 percentagem do distribuidor e dos impostos (aplicados, primeiro os impostos sobre
 o custo de fábrica, e depois a percentagem do distribuidor sobre o resultado).
 Supondo que a percentagem do distribuidor seja de 28% e os impostos 45%.
 Escrever um programa que leia o custo de fábrica de um carro e informe o custo ao
 consumidor do mesmo*/

import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o custo de fábrica do carro: ");
        double vFabrica = scanner.nextDouble();

        double vFinal = (vFabrica * 1.45) * 1.28;

        System.out.printf("O valor final do carro irá ser de : R$ %.2f", vFinal);

        scanner.close();
    }
}
