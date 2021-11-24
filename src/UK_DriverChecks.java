import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class UK_DriverChecks {


    public static void main(String[] args) {

        String path = "C:\\Users\\User\\Desktop\\UK_Driver\\table.txt";
        String line = "";
        String NA = "N/A";


        ArrayList<String> full = new ArrayList<String>();
        ArrayList<String> provisional = new ArrayList<String>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                String[] values = line.split(" ");
                if (values[2].equals("N/A")) {
                    continue;
                }
                if (values[1].equals("Full")) {
                  full.add(values[0]);
                }
                if (values[1].equals("Provisional")) {
                    provisional.add(values[0]);
                }
                System.out.println("Code: " + values[0] + "; License Status - " + values[1] + "; Commence - " + values[2] + "; Expire - " + values[3]);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Full: " + full);
        System.out.println("Provisional: " + provisional);
    }
}

