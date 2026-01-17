
import java.util.ArrayList;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        // ----------LISTA DE COMANDOS ------------
        String cmdAdd = "add ";
        String cmdRemove = "rem ";
        String cmdPesquisa = "pesq ";
        String cmdLista = "lista";
        String cmdSair = "sair";
        // ----------------------------------------
        while (true) {
            System.out.printf(
                    "Digite o comando: (\"%s\"/\"%s\"/\"%s\") + nome.%n\"%s\" para checar a lista.%nDigite \"%s\" para fechar o programa: ",
                    cmdAdd, cmdRemove, cmdPesquisa, cmdLista, cmdSair);
            String texto = scanner.nextLine();
            if (texto.contains(cmdAdd)) {
                texto = texto.replace(cmdAdd, "");
                nomes.add(texto);
                System.out.printf("\"%s\" Adicionado na lista%n", texto);
            } else if (texto.contains(cmdRemove)) {
                texto = texto.replace(cmdRemove, "");
                int index = nomes.indexOf(texto);
                nomes.remove(index);
                System.out.printf("\"%s\" Removido na lista%n", texto);
            } else if (texto.contains(cmdPesquisa)) {
                texto = texto.replace(cmdPesquisa, "");
                if (nomes.contains(texto)) {
                    System.out.printf("O nome \"%s\" está presente na lista.%n", texto);
                } else {
                    System.out.printf("O nome \"%s\" NÃO está presente na lista.%n", texto);
                }
            } else if (texto.equalsIgnoreCase(cmdLista)) {
                System.out.println("-------------LISTA----------------");
                for (String nome : nomes) {
                    System.out.println(nome);
                }
            } else if (texto.equalsIgnoreCase(cmdSair)) {
                System.out.println("PROGRAMA ENCERRADO!");
                break;
            } else {
                System.out.println("Comando incorreto!");
            }
            System.out.println("--------------------------------");
        }

        scanner.close();
    }
}
