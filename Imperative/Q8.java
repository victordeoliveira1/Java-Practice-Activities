
/*Questão 8: Cálculo de Salário 
 Faça um programa que pergunte quanto você ganha por hora e o número de horas
 trabalhadas no mês. Calcule e imprima o total do seu salário no referido mês. */
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanto você recebe por hora: ");
        double valor = scanner.nextDouble();

        System.out.print("Quantas horas você trabalhou no mês? ");
        double horas = scanner.nextDouble();

        System.out.println("Você irá receber: R$" + (valor * horas)+" de salário este mês.");

        scanner.close();
    }
}
