
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        int[] tab = new int[10];
        int j = 0;
        Random rand = new Random();

        for (int i = 0; i < tab.length * 2; i++) {
            if (i < tab.length) {
                tab[i] = rand.nextInt(10);
                System.out.print(tab[i] + " ");
            }
            if (i > tab.length) {
                System.out.print(tab[(tab.length -1)- j] + " ");
                j++;

            }


        }
    }
}
