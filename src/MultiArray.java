import java.util.Random;

public class MultiArray {

    private int[][] tab;




    public MultiArray(int n, int m) {            // konstruktor z przypisaniem losowych wartości

        this.tab = new int[n][m];

        randomize();

    }


    public void randomize() {                 // uzupełnia tablicę nowymi, losowymi liczbami

        Random rand = new Random();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = rand.nextInt(10);
            }
        }
    }


    int findMin() {                     // zwraca najmniejszą wartość w tablicy
        int min = tab[0][0];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (min > tab[i][j]) min = tab[i][j];
            }
        }
        return min;
    }

    int findMax() { // zwraca największą wartość w tablicy
        int max = tab[0][0];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (max < tab[i][j]) max = tab[i][j];
            }
        }


        return max;
    }

    void print() {            // wyświetla tablicę w konsoli w czytelnej formie

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                //   tab[i][j] = rand.nextInt(10);

                System.out.print(tab[i][j]+" ");

            }
            System.out.println(" ");
        }
    }


}
