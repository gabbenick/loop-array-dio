import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) {
                System.out.println("inválido");
                break;
            }
            System.out.println("Idade: ");
            idade = scan.nextInt();
        }

    }
}
