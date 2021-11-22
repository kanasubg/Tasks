package com.company;
import java.math.BigInteger;
import java.util.Scanner;

public class BigInt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger f = sc.nextBigInteger();
        BigInteger d = sc.nextBigInteger();

        System.out.println(f.add(d));
        System.out.println(f.multiply(d));

    }
}
