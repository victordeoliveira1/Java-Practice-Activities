/*Questão 7: Área de um Quadrado
 Faça um programa que calcule a área de um quadrado, em seguida imprima o
 dobro desta área para o usuário. A área de um quadrado é dada por A = 𝐿2, onde 𝐿
 é ocomprimento do lado do quadrado. */ 
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("informe a largura do quadrado: ");
        double largura = scanner.nextDouble();

        double area = largura * largura;

        System.out.println("A área do quadrado é: " + area);
        scanner.close();
    }
}
