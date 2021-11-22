package com.company;

public class Generics {

    public static void main(String[] args) {

        Integer[] iray = {1, 2, 3};

        String[] cray = {"Hello"};
        String[] craySecond = {"World"};


        printme(iray);

        printme(cray);
        printme(craySecond);
    }

    public static <T> void printme(T[] x) {
        for (T b : x) {
            System.out.printf("%s", b);
            System.out.println();
        }
    }
}
