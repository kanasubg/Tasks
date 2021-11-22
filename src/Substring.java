import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Substring {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = sc.nextLine();
        int startElement = sc.nextInt();
        int finalElement = sc.nextInt();

        char[] chars = str.toCharArray();

        for (int i = startElement; i < chars.length; i++) {
            if (i == finalElement) {

                break;
            }
            System.out.print(chars[i]);

        }


    }

}

