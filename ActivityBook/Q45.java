import java.util.Scanner;

public class Q45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1 = 0;
        double nota2 = 0;
        int notasValidas = 0;
        String texto = "Digite a primeira nota: ";

        while (true) {
            System.out.printf("%s", texto);
            double notaTemp = scanner.nextDouble();
            if (notaTemp >= 0 && notaTemp <= 10) {
                if (notasValidas == 0) {
                    nota1 = notaTemp;
                    notasValidas++;
                    texto = "Digite a segunda nota: ";
                }else if (notasValidas == 1) {
                    nota2 = notaTemp;
                    notasValidas++;
                    break;
                }
            } else {
                System.out.println("NOTA INVÁLIDA");
            }
        }
        System.out.printf("Média = %.2f", (nota1 + nota2) / 2);
        scanner.close();
    }
}
