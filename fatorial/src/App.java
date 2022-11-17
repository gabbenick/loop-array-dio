import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial de qual número?");
        int num = scan.nextInt();

        int fatorial = 1;

        for (int i = num; i > 0; i--) {
            fatorial = fatorial * i;
        }
        System.out.println(num + "! = " + fatorial);
    }
}
