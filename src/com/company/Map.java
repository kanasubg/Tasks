package com.company;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class Map<I extends Number, L extends Collection<E>, E> {

    public static void main(String[] args) {

        HashMap <String, Integer> contacts = new HashMap<String, Integer>();


        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();

            contacts.put(name,phone);
        //    System.out.println(contacts);


            in.nextLine();

        }
        while (in.hasNext()) {
            String s = in.nextLine();
          if(contacts.containsKey(s))  {
              System.out.println(s + "=" + contacts.get(s));
          }else
              System.out.println("Not found");

        }
    }
}
