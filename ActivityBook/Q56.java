import java.util.Scanner;

public class Q56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        System.out.print("Digite seu nome completo: ");
        name = scanner.nextLine().toLowerCase();

        String[] names = name.split(" ");

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("silva")) {
                System.out.println("Tem \"Silva\"");
                break;
            }
            if (i == names.length - 1) {
                System.out.println("Não Tem \"Silva\"");
            }
        }

        scanner.close();
    }
}
