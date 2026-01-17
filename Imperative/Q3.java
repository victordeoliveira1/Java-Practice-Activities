
/*Questão 3: Soma de Dois Números
 Faça um programa que peça dois números e imprima a soma. */
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois números para somar.");
        System.out.print("Número 01:");
        int num1 = scanner.nextInt();
        System.out.print("Número 02:");
        int num2 = scanner.nextInt();

        System.out.println("A soma dos dois números é: " + (num1 + num2));         

        scanner.close();
    }
}
