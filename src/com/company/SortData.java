package com.company;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SortData {
    //in
    //5
    //33 Rumpa 3.68
    //85 Ashis 3.85
    //56 Samiha 3.75
    //19 Samara 3.75
    //22 Fahim 3.76//

    //out
    // Ashis
    //Fahim
    //Samara
    //Samiha
    //Rumpa

    public static void main(String[] args) {

        Map<String, List<String>> myMaps = new HashMap<String, List<String>>();

        Scanner sc = new Scanner(System.in);
        Scanner scPlayer = new Scanner(System.in);
        int number = sc.nextInt();


        for (int i = 0; i < number; i++) {

            String currentPlayer = scPlayer.nextLine();
        }




    }
}
