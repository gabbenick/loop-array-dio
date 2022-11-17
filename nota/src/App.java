import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        nota = scan.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Digite novamente: ");
            nota = scan.nextInt();
            if (nota > 0 && nota < 10) {
                System.out.println("Nota válida: " + nota);
            }
        }
    }
}
