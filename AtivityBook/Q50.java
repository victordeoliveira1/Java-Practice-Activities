import java.util.Scanner;

public class Q50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "";
        int maiorIdade = 0;
        int menorIdade = Integer.MAX_VALUE;
        double soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digite o nome da %dº pessoa: ", i);
            String nomeTemp = scanner.next();
            System.out.printf("Digite a idade da %dº pessoa: ", i);
            int idadeTemp = scanner.nextInt();
            if (idadeTemp > maiorIdade) {
                maiorIdade = idadeTemp;
            } else if (idadeTemp < menorIdade) {
                menorIdade = idadeTemp;
                nome = nomeTemp;
            }
            soma += idadeTemp;
        }
        System.out.printf("%nMaior idade = %d%nNome da pessoa mais nova = %s%nMédia das idades = %.1f%n", maiorIdade, nome,
                (soma / 5));

        scanner.close();
    }
}
