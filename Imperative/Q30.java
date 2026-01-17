/* Questão 30: Cálculo de Comissão sobre Vendas
 Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total
 de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor
 ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o
 salário fixo e salário no final do mês*/

import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do vendedor: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o salário fixo: ");
        double salario = scanner.nextDouble();
        System.out.print("Digite valor total em vendas: ");
        double vendas = scanner.nextDouble();

        double novoSalario = salario + (vendas * 0.15);

        System.out.printf(
                "O " + nome + " tem um salário fixo de : R$ " + salario + ", mas o salário final será de : %.2f",
                novoSalario);

        scanner.close();
    }
}
