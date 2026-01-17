/* Questão 13: Cálculo da Área de um Retângulo
 Implemente um programa em Java que receba a largura e a altura de um retângulo
 e imprima sua área. A fórmula da área do retângulo é: 𝐴 = 𝑙𝑎𝑟𝑔𝑢𝑟𝑎 × 𝑎𝑙𝑡𝑢𝑟𝑎.*/

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a largura do retângulo: ");
        double largura = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = largura * altura;
        System.out.println("A área do retângulo é : " + area);
        scanner.close();
    }
}
