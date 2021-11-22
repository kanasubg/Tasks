package com.company;

import java.util.Scanner;

public class CompareObjects {
    String name;
    String score;

    public CompareObjects(String name, String score) {
        this.name = name;
        this.score = score;
    }


    public static void main(String[] args) {


        Scanner numberPlayers = new Scanner(System.in);
        Scanner playersData = new Scanner(System.in);

        int num = numberPlayers.nextInt();
        Object[] allPlayers = new Object[num];


        for (int i = 0; i < num; i++) {
            String currentPlayerData = playersData.nextLine();
            String[] arrOfStr = currentPlayerData.split(" ", 1);


            CompareObjects currentPlayer = new CompareObjects(arrOfStr[0], arrOfStr[1]);
            allPlayers[i] = currentPlayer;
        }

        for (Object a:allPlayers) {
            System.out.println(a);
        }
    }
}
