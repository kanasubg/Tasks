import java.io.*;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateAndTime {


    public static String findDay(int day, int month, int year) {
        int DayyOfWeek = 0;
        int m;
        int y;

        String DayyOfWeekletter = null;
        m = (month - 2 + 12) % 12;
        if (month <= 2) {
            year--;

        }
        y = 5 * (year % 4) + 4 * (year % 100) + 6 * (year % 400);
        DayyOfWeek = (day + (int) (2.6 * m - 0.2) + y) % 7;


        switch (DayyOfWeek) {
            case 1:
                DayyOfWeekletter = "Monday";break;
            case 2:
                DayyOfWeekletter = "Tuesday";break;
            case 3:
                DayyOfWeekletter = "Wednesday";break;
            case 4:
                DayyOfWeekletter = "Thursday";break;
            case 5:
                DayyOfWeekletter = "Friday";break;
            case 6:
                DayyOfWeekletter = "Saturday";break;
            case 7:
                DayyOfWeekletter = "Sunday";break;
        }
        System.out.println(DayyOfWeek);
        return DayyOfWeekletter;


    }


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day: ");
        int day = sc.nextInt();
        System.out.println("Enter month: ");
        int month = sc.nextInt();
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        sc.close();

        System.out.println("The entered date is day: " + DateAndTime.findDay(day, month, year));

    }
}

