/* Questão 20: Cálculo de Salário e Descontos
 Faça um programa que pergunte quanto você ganha por hora e o número de horas
 trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês,
 sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e
 5%para o sindicato, faça um programa que nos dê:
 a. Salário bruto.
 b. Quanto pagou ao INSS.
 c. Quanto pagou ao sindicato.
 d. O salário líquido.
 e. Calcule os descontos e o salário líquido. */

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite quanto você recebe por hora: ");
        double vHora = scanner.nextDouble();
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horas = scanner.nextDouble();

        double bruto = vHora * horas;

        double ir = bruto * 0.11;
        double inss = bruto * 0.08;
        double sindicato = bruto * 0.05;

        double sLiquido = bruto - ir - inss - sindicato;

        System.out.println("Salário bruto: " + bruto + "\nIr: " + ir + "\nINSS: " + inss + "\nSindicato: " + sindicato
                + "\nTotal de descontos: " + (ir + inss + sindicato) + "\nTotal Liquido: " + sLiquido);
        scanner.close();
    }
}
