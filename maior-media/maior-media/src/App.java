import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int i = 0;
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior)
                maior = numero;
            i++;
        } while (i < 5);
        int media = soma / 5;

        System.out.println("Maior número: " + maior);
        System.out.println("Média: " + media);
    }
}
