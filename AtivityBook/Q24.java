import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade em dias: ");
        int idade = scanner.nextInt();

        int anos = idade / 365;
        idade = idade % 365;
        int meses = idade / 30;
        idade = idade % 30;
        int dias = idade;

        System.out.printf("%d ano(s)%n",anos);
        System.out.printf("%d meses(s)%n",meses);
        System.out.printf("%d dias(s)%n",dias);


        scanner.close();
    }
}
