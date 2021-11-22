import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Palindrome {

    public void IsPalindrome(String suggestion) {

        String word = suggestion;
        char[] chars = word.toCharArray();

        char[] reversed = word.toCharArray();


        int left = 0;
        int right = reversed.length - 1;
        while (left < right) {
            char temp = reversed[left];
            reversed[left] = reversed[right];
            reversed[right] = temp;
            left++;
            right--;
        }
        System.out.println(chars);
        System.out.println(reversed);


        if (Arrays.equals(chars, reversed)) {
            System.out.println("Yes, the word is palindrome!");

        } else {
            System.out.println("No, the word is NOT palindrome!");
        }
    }


    public static void main(String[] args) {

        Palindrome p = new Palindrome();
        p.IsPalindrome("madam");


    }
}


