/*Questão 6: Área de um Círculo
 Faça um programa que peça o raio de um círculo, calcule e imprima sua área. A
 área de um círculo é dada por 𝐴𝐶 = 2 × π ×𝑅2, onde 𝑅 é o raio do círculo. Considere π = 3,14 */
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos calcular a área de um cículo.");
        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        double area = 3.14 * (raio * raio); // formula alterada devido a erro no slide pois no slide informa: 𝐴𝐶 = 2 × π ×𝑅2

        System.out.println("A área do circulo é: " + area);
        scanner.close();
    }
}
