import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TaskArrayList {


    public static void main(String[] args) {

        Scanner inputSize = new Scanner(System.in);
        int size = inputSize.nextInt();

        Scanner inputNumbers = new Scanner(System.in);
        String numbers = inputNumbers.nextLine();

        Scanner inputQueries = new Scanner(System.in);
        int queries = inputQueries.nextInt();

        Scanner inputClientsCommandInsert = new Scanner(System.in);
        String clientsCommandInsert = inputClientsCommandInsert.nextLine();

        Scanner inputChangeNumber = new Scanner(System.in);
        String  changeNumber = inputChangeNumber.nextLine();

        Scanner inputclientsCommandDelete = new Scanner(System.in);
        String clientsCommandDelete = inputclientsCommandDelete.nextLine();

        Scanner inputDeleteNumber = new Scanner(System.in);
        int deleteNumber = inputDeleteNumber.nextInt();






        String[] strNumbers = numbers.split(" ");
        int[] intNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            intNumbers[i] = Integer.parseInt(strNumbers[i]);
        }


        for (int i = 0; i < queries; i++) {

            String[] strQueries = changeNumber.split(" ");
            int[] arrQueries = new int[strQueries.length];

            for (int ii = 0; ii < queries; ii++) {
                arrQueries[ii] = Integer.parseInt(strQueries[ii]);
            }
            int z = arrQueries[0];
            int k = arrQueries[0];


            intNumbers[z] = k;
            List al = Arrays.asList(intNumbers);
            al.remove(deleteNumber);
            System.out.println(al);

        }

    }

}





