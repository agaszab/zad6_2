import java.util.Random;

public class Program {

    public static void main(String[] args) {
        int n = 4;
        int m = 3;

        MultiArray multi = new MultiArray(n, m);

        multi.print();

        System.out.println("Najmniejsza wartość w tablicy to: " + multi.findMin());
        System.out.println("Największa wartość w tablicy to: " + multi.findMax());
        System.out.println();

        multi.randomize();
        multi.print();

        System.out.println();
        System.out.println("Najmniejsza wartość w tablicy to: " + multi.findMin());
        System.out.println("Największa wartość w tablicy to: " + multi.findMax());
    }
}


