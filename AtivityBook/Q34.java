import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = 0;
        int maiorIdade = -1;
        while (idade != 100) {
            System.out.print("Digite a idade: ");
            idade = scanner.nextInt();
            if (idade == 100) {
                break;
            } else {
                if (idade > maiorIdade) {
                    maiorIdade = idade;
                }
            }
        }
        System.out.printf("Maior Idade = %d", maiorIdade);

        scanner.close();
    }
}
