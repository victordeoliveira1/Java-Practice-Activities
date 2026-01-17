import java.util.Scanner;

public class Q60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String primeiraParte = "";
        String segundaParte = "";
        String senha = "";

        System.out.print("Digite um nome com 10 characteres: ");
        String texto = scanner.next();

        for (int i = 0; i < texto.length(); i++) {
            if (i < texto.length() / 2) {
                primeiraParte = primeiraParte + texto.charAt(i);
            } else {
                segundaParte = segundaParte + texto.charAt(i);
            }
        }

        String inicio = "" + segundaParte.charAt(0) + segundaParte.charAt(1);
        String fim = "" + primeiraParte.charAt((primeiraParte.length() - 3))
                + primeiraParte.charAt((primeiraParte.length() - 2))
                + primeiraParte.charAt((primeiraParte.length() - 1));

        senha = inicio + "%%" + fim;
        System.out.printf("Parte 1 = \"%s\"%nParte2 = \"%s\"%nSenha = \"%s\"%n", primeiraParte, segundaParte, senha);
        scanner.close();
    }
}
