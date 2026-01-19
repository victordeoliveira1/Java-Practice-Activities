import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sigla do bairro (S/I/T): ");
        String bairro = scanner.nextLine().toUpperCase();
        System.out.print("Digite sua renda: ");
        double renda = scanner.nextDouble();
        System.out.print("Digite o consumo: ");
        double consumo = scanner.nextDouble();

        double desconto = 0;

        if (bairro.equals("S") || bairro.equals("I") || bairro.equals("T")) {
            if (renda < 0 || consumo < 0) {
                System.out.println("RENDA E CONSUMO NÃO PODEM SER NEGATIVOS");
            } else {
                if (bairro.equals("S")) {
                    if (renda >= 50 && renda <= 500) {
                        desconto = 50;
                    } else if (renda > 500 && renda <= 1000) {
                        desconto = 25;
                    } else {
                        desconto = 0;
                    }
                } else if (bairro.equals("I")) {
                    if (renda >= 240 && renda <= 1000) {
                        desconto = 240;
                    } else if (renda > 1000 && renda <= 5000) {
                        desconto = 120;
                    } else {
                        desconto = 0;
                    }
                } else {
                    if (renda > 5000 && renda <= 10000) {
                        desconto = 720;
                    } else if (renda > 10000 && renda <= 20000) {
                        desconto = 360;
                    } else {
                        desconto = 0;
                    }
                }
                System.out.printf("Valor a pagar: R$ %.2f", (consumo - desconto));
            }

        } else {
            System.out.println("BAIRRO INVÁLIDO");
        }

        scanner.close();
    }
}
