import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class OddNumber {



    public static List<Integer> oddNumbers(int l, int r) {

        List odd = new ArrayList();
        for (int i = l; i <= r; i++) {
            if(!(i % 2 == 0)){
                odd.add(i);

            }

            for (int j = 0; j < odd.size(); j++) {

                System.out.println(j);

            }
        }
      return odd;

    }

}
