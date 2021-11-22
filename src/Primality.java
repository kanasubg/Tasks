import java.math.BigInteger;
import java.util.Scanner;

public class Primality {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        BigInteger bnumber = n.nextBigInteger();


        if (bnumber.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("Not prime");
        }


    }
}
