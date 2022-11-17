import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int pares = 0, impares = 0;

        System.out.println("Quantidade de número: ");
        quantNumeros = scan.nextInt();

        int i = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            i++;
        } while (i < quantNumeros);

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);

    }
}
