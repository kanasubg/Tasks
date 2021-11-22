import javax.sound.midi.Soundbank;

public class Recursion {
    static int  sum = 1;
    public static void main(String[] args) {


        Factorial(5);
    }

    public static void Factorial(int n) {
        if (n == 1) {
            System.out.println("It's done!");
        } else {
            sum = sum * n;
            System.out.println(sum);
            n--;
            Factorial(n);

        }
    }

}


