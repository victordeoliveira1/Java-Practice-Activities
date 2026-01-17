import java.util.Scanner;

public class Q38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a população do país A: ");
        long pA = scanner.nextLong(); // taxa anual de 3%;
        System.out.print("Digite a população do país B: ");
        long pB = scanner.nextLong(); // taxa anual de 1.5%;
        int anos = 0;
        while (true) {
            if (pA >= pB) {
                break;
            } else {
                pA = (long) (pA * 1.03);
                pB = (long) (pB * 1.015);
                anos++;
            }
        }
        System.out.println("Quantidade de Anos: " + anos);
        scanner.close();
    }
}
