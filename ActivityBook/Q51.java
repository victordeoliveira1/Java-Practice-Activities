import java.util.Scanner;

public class Q51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double homens = 0, mulheres = 0, homensN = 0, mulheresS = 0, totalSim = 0, totalNao = 0;

        while (true) {
            System.out.print("Digite o sexo(M/F): ");
            String sexo = scanner.next().toUpperCase();
            if (sexo.equals("FIM")) {
                break;
            } else {
                System.out.print("Digite a resposta: ");
                String resposta = scanner.next().toUpperCase();
                if (sexo.equals("M")) {
                    homens++;
                    if (resposta.equals("SIM")) {
                        totalSim++;
                    } else if (resposta.equals("NAO")) {
                        homensN++;
                        totalNao++;
                    } else {
                        System.out.println("Sexo incorreto");
                    }
                } else if (sexo.equals("F")) {
                    mulheres++;
                    if (resposta.equals("SIM")) {
                        mulheresS++;
                        totalSim++;
                    } else if (resposta.equals("NAO")) {
                        totalNao++;
                    } else {
                        System.out.println("Sexo incorreto");
                    }
                }
            }
        }
        double perc_C = Math.floor((mulheresS / mulheres) * 100);
        double perc_D = Math.floor((homensN / (homens + mulheres)) * 100);
        
        System.out.printf("Qtd SIM = %.0f%nQtd Não = %.0f%nPerc_C = %.0f%%%nPerc_D = %.0f%%%n", totalSim, totalNao, perc_C,
                perc_D);
        scanner.close();
    }
}
