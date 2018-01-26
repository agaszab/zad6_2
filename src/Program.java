import java.util.Random;

public class Program {

    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        int[][] tab = new int[n][m];

        MultiArray multi = new MultiArray(tab);
        Random rand = new Random();

        multi.MultiArray(n, m);
        multi.print(tab);

        System.out.println("Najmniejsza wartość w tablicy to: "+ multi.findMin());
        System.out.println("Największa wartość w tablicy to: "+ multi.findMax());
        System.out.println();

        multi.randomize();
        multi.print(tab);

        System.out.println();
        System.out.println("Najmniejsza wartość w tablicy to: "+ multi.findMin());
        System.out.println("Największa wartość w tablicy to: "+ multi.findMax());
    }
}


