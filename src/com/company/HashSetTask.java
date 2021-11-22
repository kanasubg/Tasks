package com.company;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetTask {

    public static void main(String[] args) {


        Scanner number = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        int numberOfCouples = number.nextInt();
        int[]arr = new int[numberOfCouples];
        HashSet<String> h = new HashSet<String>();

        for (int i = 0; i < numberOfCouples; i++) {
            String current = scs.nextLine();
            h.add(current);
          int currentN = (h.size());
          arr[i] = currentN;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
