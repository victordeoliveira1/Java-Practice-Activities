import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a idade do funcionário: ");
        int idade = scanner.nextInt();
        System.out.print("Informe o sexo (M/F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        double novoSalario = salario;
        double reajuste = 0;

        if (idade > 30) {
            if (sexo == 'M' && salario <= 3000) {
                reajuste = 0.30;
            } else if (sexo == 'F') {
                reajuste = 0.50;
            } else {
                if (sexo == 'F') {
                    reajuste = 0.40;
                } else if (sexo == 'M') {
                    reajuste = 0.20;
                }
            }
        }
        if (reajuste > 0) {
            novoSalario = salario + (salario * reajuste);
            System.out.printf("O novo salário será de: R$ %.2f",novoSalario);
        }else{
            System.out.println("O funcionário não receberá aumento.");
        }

        scanner.close();
    }
}
