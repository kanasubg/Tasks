import java.util.Scanner;

public class Array1D {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] myArray = new int[n];


        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = sc.nextInt();
        }

        sc.close();
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);

        }

    }
}