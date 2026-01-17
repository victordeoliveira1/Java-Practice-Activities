/*Questão 34: Centenas, Dezenas e Unidades
 Dado um número inteiro, positivo e menor do que 1000, imprimir a quantidade de
 centenas, dezenas e unidades desse número.
 Exemplo: Dado o número 764, imprimir:
 Centena = 7, Dezena = 6 e Unidade = 4 */

import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número entre 1 e 999:");
        double num = scanner.nextDouble();

        double vReduzido = num / 100;

        int centena = (int) Math.floor(vReduzido);
        int dezena = (int) Math.floor((vReduzido - centena) * 10);
        int unidade = (int) Math.floor((((vReduzido - centena) * 10) - dezena) * 10);

/*  Solução pelo chat gpt:
            int numero = scanner.nextInt();
            
            int centenas = numero / 100;            // Pega a parte das centenas
            int dezenas = (numero % 100) / 10;      // Pega a parte das dezenas
            int unidades = numero % 10;             // Pega a parte das unidades
 */
        System.out.println("Centena: " + centena + "\nDezena: " + dezena + "\nUnidade: " + unidade);

        scanner.close();
    }
}
