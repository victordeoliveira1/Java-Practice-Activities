import java.util.Scanner;

public class Q46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tipo1 = 0;
        int tipo2 = 0;
        int tipo3 = 0;

        double litros1 = 0;
        double litros2 = 0;
        double litros3 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digite o tipo de combustivel do %dº cliente(1/2/3): ", i);
            int tipoTemp = scanner.nextInt();
            System.out.printf("Digite a quantidade de combustivel do %dº cliente: ", i);
            double litrosTemp = scanner.nextDouble();
            if (tipoTemp == 1) {
                tipo1++;
                litros1 += litrosTemp;
            } else if (tipoTemp == 2) {
                tipo2++;
                litros2 += litrosTemp;
            } else if (tipoTemp == 3) {
                tipo3++;
                litros3 += litrosTemp;
            } else {
                System.out.println("Tipo incorreto;");
                i--;
            }
        }
        System.out.printf(
                "Álcool: %d - Qtd Litros: %.2f%nGasolina: %d - Qtd Litros: %.2f%nDiesel: %d - Qtd Litros: %.2f%n",
                tipo1, litros1, tipo2, litros2, tipo3, litros3);

        scanner.close();
    }
}
