import java.io.*;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Result {







    public static String findNumber(List<Integer> arr, int k) {

        String yes = "YES";
        String no = "NO";



        if(arr.contains(k)){
            System.out.println(yes);
            return yes;

        }else{
            System.out.println(no);
            return no;
        }


    }

}