import java.util.Scanner;

public class Q41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sexo = "";
        double mediaM = 0;
        double altura = 0;
        double menorAltura = Double.MAX_VALUE;
        int totalM = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d - Digite o sexo(M/F): ", i);
            sexo = scanner.next().toUpperCase();
            System.out.printf("%d - Digite a altura: ", i);
            altura = scanner.nextDouble();
            if (altura < menorAltura) {
                menorAltura = altura;
            }
            if (sexo.equals("M")) {
                mediaM += altura;
                totalM++;
            }
        }
        System.out.printf("Menor Altura = %.2f%nMédia Altura Meninos = %.2f%n", menorAltura, (mediaM / totalM));

        scanner.close();
    }
}
