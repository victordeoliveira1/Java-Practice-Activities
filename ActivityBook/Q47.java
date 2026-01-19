import java.util.Scanner;

public class Q47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sexo = "";
        double altura = 0;

        double maiorAltura = Double.MIN_VALUE;
        double alturaMulheres = 0;
        int homens = 0;
        int mulheres = 0;

        while (true) {
            System.out.print("Digite o sexo: ");
            sexo = scanner.next().toUpperCase();
            if (sexo.equals("FIM")) {
                break;
            } else {
                System.out.print("Digite a altura: ");
                altura = scanner.nextDouble();
                if (altura > maiorAltura) {
                    maiorAltura = altura;
                }
                if (sexo.equals("M")) {
                    homens++;
                } else if (sexo.equals("F")) {
                    alturaMulheres += altura;
                    mulheres++;
                } else {
                    System.out.println("Sexo não existe;");
                }
            }
        }
        System.out.printf("Maior Altura = %.2f%nMédia Altura Mulheres = %.3f%nQtd de Homens = %d%n", maiorAltura,
                (alturaMulheres / mulheres), homens);

        scanner.close();
    }
}
