/*Questão 18: Cálculo de Peso Ideal II
 Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo
 que calcule seu peso ideal, utilizando as seguintes fórmulas:
 a. Para homens: (72.7*h)- 58
 b. Para mulheres: (62.1*h)- 44.7 */

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double homem = (72.7 * altura) - 58;
        double mulher = (62.1 * altura) - 44.7;

        System.out.println("O peso ideal para Homem: " + homem + "kg\nO peso ideal para mulher: " + mulher + "kg");        

        scanner.close();
    }
}
