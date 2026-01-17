import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos homens tem? ");
        int homens = scanner.nextInt();
        System.out.print("Quantas mulheres tem? ");
        int mulheres = scanner.nextInt();
        System.out.print("Qual o total de ausentes? ");
        int ausentes = scanner.nextInt();

        double p1 = (double)homens * 100 / (homens + mulheres + ausentes);
        double p2 = (double)ausentes * 100 / (homens + mulheres);

        System.out.printf("P1 = %f%%%nP2 = %f%%",p1,p2);
        scanner.close();
    }
}
