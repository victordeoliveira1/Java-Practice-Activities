/* Questão 27: Conversão de Unidades (Moeda)
 Elaborar um programa que efetue a apresentação do valor da conversão em real
 (R$) de um valor lido em dólar (US$). O programa deverá solicitar o valor da
 cotação do dólar e a quantidade de dólares disponíveis com o usuário.*/

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a cotação do Dolar em Real: ");
        double cotacao = scanner.nextDouble();
        System.out.print("Digite quantod Dolares você tem: ");
        double dolares = scanner.nextDouble();

        double real = dolares * cotacao;

        System.out.printf("Agora você tem: %.2f reais.", real);

        scanner.close();
    }
}
