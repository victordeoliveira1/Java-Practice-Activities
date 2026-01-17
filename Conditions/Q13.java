import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número entre 1 e 7: ");
        int num = scanner.nextInt();

        String dia = "";

       if (num==1) {
        dia = "Domingo";
       }else if (num ==2) {
        dia = "Segunda";
       }else if (num == 3) {
        dia = "Terça";
       }else if (num ==4 ) {
        dia = "Quarta";
       }else if (num ==5 ) {
        dia = "Quinta";
       }else if (num ==6 ) {
        dia = "Sexta";
       }else if (num ==7 ) {
        dia = "Sábado";
       }else {
        dia="Valor inválido";
       }
        
       System.out.println(dia);
        scanner.close();
    }
}
