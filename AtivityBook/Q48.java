import java.util.Scanner;

public class Q48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double peso = 0;
        double altura = 0;
        String mensagem = "";

        System.out.print("Digite sua altura: ");
        altura = scanner.nextDouble();
        System.out.print("Digite seu peso: ");
        peso = scanner.nextDouble();
        if (altura <= 1.5) {
            if (peso < 50) {
                mensagem = "Engorde " + (50 - peso) + " kg";
            } else if (peso > 50) {
                mensagem = "Emagreça " + (peso - 50) + " kg";
            } else {
                mensagem = "Parabéns, peso ideal!";
            }
        } else if (altura <= 1.9) {
            if (peso < 70) {
                mensagem = "Engorde " + (70 - peso) + " kg";
            } else if (peso > 70) {
                mensagem = "Emagreça " + (peso - 70) + " kg";
            } else {
                mensagem = "Parabéns, peso ideal!";
            }
        } else {
            if (peso < 100) {
                mensagem = "Engorde " + (100 - peso) + " kg";
            } else if (peso > 100) {
                mensagem = "Emagreça " + (peso - 100) + " kg";
            } else {
                mensagem = "Parabéns, peso ideal!";
            }
        }

        System.out.println(mensagem);

        scanner.close();
    }
}
