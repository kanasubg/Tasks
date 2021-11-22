import java.net.SecureCacheResponse;
import java.util.Scanner;
import java.util.TreeSet;

public class Array2D {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int u;
        int y;
        int o;
        int h;
        TreeSet<Integer> elements = new TreeSet<Integer>();

        int[][] arr = new int[6][6];

        for (u = 0; u < 6; u++) {

            for (y = 0; y < 6; y++) {
                arr[u][y] = sc.nextInt();


            }


        }
        sc.close();
        for (o = 0; o < arr.length; o++) {
            for (h = 0; h < arr.length; h++) {
                System.out.print(arr[o][h]);
            }
            System.out.println();

        }
        elements.add((arr[0][0]) + (arr[0][1]) + (arr[0][2]) + (arr[1][1]) + (arr[2][0]) + (arr[2][1]) + (arr[2][2]));
        elements.add((arr[0][1]) + (arr[0][2]) + (arr[0][3]) + (arr[1][2]) + (arr[2][1]) + (arr[2][2]) + (arr[2][3]));
        elements.add((arr[0][2]) + (arr[0][3]) + (arr[0][4]) + (arr[1][3]) + (arr[2][2]) + (arr[2][3]) + (arr[2][4]));
        elements.add((arr[0][3]) + (arr[0][4]) + (arr[0][5]) + (arr[1][4]) + (arr[2][3]) + (arr[2][4]) + (arr[2][5]));

        elements.add((arr[1][0]) + (arr[1][1]) + (arr[1][2]) + (arr[2][1]) + (arr[3][0]) + (arr[3][1]) + (arr[3][2]));
        elements.add((arr[1][1]) + (arr[1][2]) + (arr[1][3]) + (arr[2][2]) + (arr[3][1]) + (arr[3][2]) + (arr[3][3]));
        elements.add((arr[2][2]) + (arr[2][3]) + (arr[2][4]) + (arr[3][3]) + (arr[4][2]) + (arr[4][3]) + (arr[4][4]));
        elements.add((arr[2][3]) + (arr[2][4]) + (arr[2][5]) + (arr[3][4]) + (arr[4][3]) + (arr[4][4]) + (arr[4][5]));

        elements.add((arr[2][0]) + (arr[2][1]) + (arr[2][2]) + (arr[3][1]) + (arr[4][0]) + (arr[4][1]) + (arr[4][2]));
        elements.add((arr[2][1]) + (arr[2][2]) + (arr[2][3]) + (arr[3][2]) + (arr[4][1]) + (arr[4][2]) + (arr[4][3]));
        elements.add((arr[2][2]) + (arr[2][3]) + (arr[2][4]) + (arr[3][3]) + (arr[4][2]) + (arr[4][3]) + (arr[4][4]));
        elements.add((arr[2][3]) + (arr[2][4]) + (arr[2][5]) + (arr[3][4]) + (arr[4][3]) + (arr[4][4]) + (arr[4][5]));

        elements.add((arr[3][0]) + (arr[3][1]) + (arr[3][2]) + (arr[4][1]) + (arr[5][0]) + (arr[5][1]) + (arr[5][2]));
        elements.add((arr[3][1]) + (arr[3][2]) + (arr[3][3]) + (arr[4][2]) + (arr[5][1]) + (arr[5][2]) + (arr[5][3]));
        elements.add((arr[3][2]) + (arr[3][3]) + (arr[3][4]) + (arr[4][3]) + (arr[5][2]) + (arr[5][3]) + (arr[5][4]));
        elements.add((arr[3][3]) + (arr[3][4]) + (arr[3][5]) + (arr[4][4]) + (arr[5][3]) + (arr[5][4]) + (arr[5][5]));


        System.out.println(elements.last());
    }

}


