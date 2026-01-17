import java.util.Scanner;

public class Q52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double altura = 0, peso = 0, imc = 0;
        String mensagem = "";

        System.out.print("Digite seu peso: ");
        peso = scanner.nextDouble();
        System.out.print("Digite sua altura: ");
        altura = scanner.nextDouble();
        imc = peso / (altura * altura);

        if (imc < 20) {
            mensagem = "Abaixo do peso";
        } else if (imc < 25) {
            mensagem = "Peso Normal";
        } else if (imc < 35) {
            mensagem = "Sobrepeso";
        } else if (imc < 40) {
            mensagem = "Obeso";
        } else {
            mensagem = "Obeso Mórbido";
        }

        System.out.printf("IMC = %.8f - %s", imc, mensagem);

        scanner.close();
    }
}
