import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite F ou M : ");
        char letra = scanner.next().toUpperCase().charAt(0);

        if (letra == 'M') {
            System.out.println("Masculino");
        } else if (letra == 'F') {
            System.out.println("Feminino");
        } else {
            System.out.println("Não é F ou M");
        }
        scanner.close();
    }
}
