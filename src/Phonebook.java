import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int contacts = sc.nextInt();



        Map<String, Integer> phonebook = new HashMap<String, Integer>();

        for (int i = 0; i < contacts; i++) {
            String name = sc.next();
            int phone = sc.nextInt();

            phonebook.put(name,phone);

        }
        System.out.println(phonebook);
    }
}