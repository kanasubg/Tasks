import java.util.ArrayList;
import java.util.List;

public class Palilndromes {

    public static void main(String[] args) {



        StringBuilder s = new StringBuilder("cocacola");
        String current = null;
      //  char[] arr = s.toCharArray();
        int length = s.length();
        List<String> allPalindromes = new ArrayList<>();
        List<String> allPalindromes2 = new ArrayList<>();
        for (int i = 0; i <= s.length(); i++) {
            for (int j = i + 2; j <= s.length(); j++) {

                allPalindromes.add(current = s.substring(i,j));
                String reverseStringFromStringBUilder = new StringBuilder(current).reverse().toString();

            }
        }
        allPalindromes2 = allPalindromes;






    }


}