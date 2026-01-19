import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro tipo de animal: ");
        String tipo1 = scanner.next().toLowerCase();
        System.out.print("Digite o segundo tipo de animal: ");
        String tipo2 = scanner.next().toLowerCase();
        System.out.print("Digite o terceiro tipo de animal: ");
        String tipo3 = scanner.next().toLowerCase();

        String animal = "";

        if (tipo1.equals("vertebrado")) {
            if (tipo2.equals("ave")) {
                if (tipo3.equals("carnivoro")) {
                    animal = "águia";
                } else if (tipo3.equals("onivoro")) {
                    animal = "pomba";
                } else {
                    System.out.println("O terceiro tipo de animal está incorreto");
                }
            } else if (tipo2.equals("mamifero")) {
                if (tipo3.equals("onivoro")) {
                    animal = "homem";
                } else if (tipo3.equals("herbivoro")) {
                    animal = "vaca";
                } else {
                    System.out.println("O terceiro tipo de animal está incorreto");
                }
            } else {
                System.out.println("O segundo tipo de animal está incorreto");
            }
        } else if (tipo1.equals("invertebrado")) {
            if (tipo2.equals("inseto")) {
                if (tipo3.equals("hematofago")) {
                    animal = "pulga";
                } else if (tipo3.equals("herbivoro")) {
                    animal = "lagarta";
                } else {
                    System.out.println("O terceiro tipo de animal está incorreto");
                }
            } else if (tipo2.equals("anelideo")) {
                if (tipo3.equals("hematofago")) {
                    animal = "sanguessuga";
                } else if (tipo3.equals("onivoro")) {
                    animal = "minhoca";
                } else {
                    System.out.println("O terceiro tipo de animal está incorreto");
                }
            } else {
                System.out.println("O segundo tipo de animal está incorreto");
            }
        } else {
            System.out.println("O primeiro tipo de animal está incorreto");
        }

        if (!animal.isEmpty()) {
            System.out.printf("O animal é : %s", animal);

        }

        scanner.close();
    }
}
