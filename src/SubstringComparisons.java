import java.io.BufferedWriter;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class SubstringComparisons {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String phrase = scan.next();

        TreeSet<String> elements = new TreeSet<String>();
        int k = scan.nextInt();
        char[] chars = phrase.toCharArray();

        for (int i = 0; k <= chars.length; i++, k++) {

            String temp = phrase.substring(i, k);
            elements.add(temp);

        }
        System.out.println(elements.first());
        System.out.println(elements.last());
    }
}




