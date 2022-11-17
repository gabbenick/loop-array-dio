import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        System.out.println("Tabuada do  " + num);

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "X" + i + "=" + (num * i));
        }
    }
}
