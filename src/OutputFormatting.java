import java.util.*;
import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = null;
        int x = 0;
        String s2 = null;
        int x2 = 0;
        String s3 = null;
        int x3 = 0;

        for (int i = 0; i < 1; i++) {
            s1 = sc.next();
            x = sc.nextInt();
        }
        for (int i = 0; i < 1; i++) {
            s2 = sc.next();
            x2 = sc.nextInt();
        }
        for (int i = 0; i < 1; i++) {
            s3 = sc.next();
            x3 = sc.nextInt();
        }
        System.out.println("================================");
        System.out.printf("%s         %03d", s1, x);
        System.out.println();
        System.out.printf("%s          %03d", s2, x2);
        System.out.println();
        System.out.printf("%s          %03d", s3, x3);
        System.out.println();
        System.out.println("================================");

    }

}
