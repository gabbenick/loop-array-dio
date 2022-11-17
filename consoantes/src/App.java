import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int numConsoantes = 0;

        for (int i = 0; i < consoantes.length; i++) {
            System.out.println("Letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o")
                    || letra.equalsIgnoreCase("u"))) {
                consoantes[i] = letra;
                numConsoantes++;
            } else {
                System.out.println("Letra é uma vogal.");
            }
        }

        System.out.println(
                "O número de consoantes é " + numConsoantes);

        System.out.print("Consoantes: ");
        for (String consoante : consoantes) {
            if (consoante != null)
                System.out.print(consoante + " ");
        }
    }

}
