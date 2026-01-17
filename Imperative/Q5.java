/* Questão 5: Conversão de Unidades (Comprimento)
 Faça um programa que converta metros para centímetros (1m = 100cm) */
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a medida em metros:");
        double medida = scanner.nextDouble();
// --------- maneira 01 --------
        double convertida = medida * 100;
        System.out.println("Sua medida em centimetros é: " + convertida + "cm");
// ----------maneira 02 -----------
        System.out.println("Sua medida em centimetros é: " + medida * 100 + "cm");
       
        scanner.close();
    }
}
