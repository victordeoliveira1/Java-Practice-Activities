import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();

        if (num1 >= num2 && num1 >= num3) {
            if (num2 <= num3) {
                System.out.printf("O número maior é o : %.2f e  o menor número é o : %.2f", num1, num2);
            } else {
                System.out.printf("O número maior é o : %.2f e  o menor número é o : %.2f", num1, num3);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num1 <= num3) {
                System.out.printf("O número maior é o : %.2f e  o menor número é o : %.2f", num2, num1);
            } else {
                System.out.printf("O número maior é o : %.2f e  o menor número é o : %.2f", num2, num3);
            }
        } else {
            if (num1 <= num2) {
                System.out.printf("O número maior é o : %.2f e  o menor número é o : %.2f", num3, num1);
            } else {
                System.out.printf("O número maior é o : %.2f e  o menor número é o : %.2f", num3, num2);
            }
        }

        scanner.close();
    }
}
