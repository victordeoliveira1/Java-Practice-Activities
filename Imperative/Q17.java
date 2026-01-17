/* Questão 17: Cálculo de Peso Ideal I
 Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que
 calcule seu peso ideal, usando a seguinte fórmula: (72.7 * altura)- 58.
*/

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        double resultado = (72.7 * altura) - 58;

        System.out.println("Seu peso ideal é: " + resultado + "kg");
        scanner.close();
    }
}
