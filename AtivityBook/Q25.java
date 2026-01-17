import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a hora inicial do jogo: ");
        int horaInicial = scanner.nextInt();
        System.out.print("Digite a hora final do jogo: ");
        int horaFinal = scanner.nextInt();

        int duracao;
        if (horaFinal > horaInicial) {
            // acabou no mesmo dia
            duracao = horaFinal - horaInicial;

        } else if (horaFinal < horaInicial) {
            // acabou no outro dia
            duracao = (24 - horaInicial) + horaFinal;
        } else {
            // acabou após 24h
            duracao = 24;
        }
        System.out.printf("O jogo durou %dh", duracao);
        scanner.close();
    }
}
