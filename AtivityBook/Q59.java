import java.util.Scanner;

public class Q59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num;
        String novoNum = "";

        System.out.print("Digite seu número: ");
        num = scanner.next();
        for (int i = 0; i < num.length(); i++) {
            novoNum = novoNum + num.charAt(i);
            if (novoNum.equals("081")) {
                novoNum = "(" + novoNum + ")9.";
            }
            if (i == num.length() - 5) {
                novoNum = novoNum + "-";
            }
        }
        System.out.println(novoNum);
        scanner.close();
    }
}
