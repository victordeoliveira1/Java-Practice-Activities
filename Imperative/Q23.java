/* Questão 23: Tempo de Download
 Faça um programa que peça o tamanho de umarquivo para download (em MB) e a
 velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado
 de download do arquivo usando este link (em minutos).*/

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do arquivo em MB: ");
        double mb = scanner.nextDouble();
        System.out.print("Digite a velocidade da internet em Mb/s: ");
        double velocidade = scanner.nextDouble();

        double segundosTotais = mb / velocidade;
        double minutos = Math.floor(segundosTotais / 60);
        double segundosFinais = segundosTotais % 60;

        System.out.println("O tempo total é de: " + minutos + " minutos e " + segundosFinais + " segundos");
        scanner.close();
    }
}
