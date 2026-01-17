/*Questão 2: Número Informado
 Faça um programa que peça um número e então mostre a mensagem:
 O número informado foi [número] */
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Me diga um número:");
        int num = scanner.nextInt();
        System.out.println("O número informado foi " + num);
        scanner.close();
    }
}
