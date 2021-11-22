import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
import java.text.*;

public class CurrencyFormatter extends DecimalFormat {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        scanner.close();


        NumberFormat formatterUSA = NumberFormat.getCurrencyInstance();
        String moneyStringUSA = formatterUSA.format(n);
        System.out.println("US: " + moneyStringUSA);

        NumberFormat formatterIND = NumberFormat.getCurrencyInstance(new Locale( "en", "IN"));
        String moneyStringIND = formatterIND.format(n);
        System.out.println("India: " + moneyStringIND);


        NumberFormat formatterCHINA = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String moneyStringCHINA = formatterCHINA.format(n);
        System.out.println("China: " + moneyStringCHINA);

        NumberFormat formatterFRA = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String moneyStringFRA = formatterFRA.format(n);
        System.out.println("France: " + moneyStringFRA);



    }
}