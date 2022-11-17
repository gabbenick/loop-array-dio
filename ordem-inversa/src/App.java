public class App {
    public static void main(String[] args) {

        int[] vetor = { 0, -5, 15, 50, 8, 4 };
        int i;
        int j;

        for (i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        for (j = vetor.length - 1; j >= 0; j--) {
            System.out.println(vetor[j]);
        }
    }
}
