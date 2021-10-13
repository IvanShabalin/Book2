package com.company;

import java.net.ServerSocket;
import java.util.Random;
public class Main {


    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(1000);

        Account ac1 = new Account();
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(5, 6);
        Fraction rez;
        rez = f1.addition(f2);
        rez.reduction();

        System.out.println(rez.getNumerator() + "/" + rez.getDenominator());


    }

}



