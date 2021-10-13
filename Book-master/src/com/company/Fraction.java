package com.company;

public class Fraction {

    private int numerator;//полня экземпляра класса
    private int denominator;

    public Fraction() {
        this(0,1);
    }

    public Fraction(int _numerator, int _denominator) {
        numerator = _numerator;

        if (_denominator == 0) {
            throw new RuntimeException("The denominator is 0");
        }
        denominator = _denominator;
    }

    public void setNumerator(int _numerator) {
        numerator = _numerator;
    }

    public void setDenominator(int _denominator) {
        if (_denominator == 0) {
            throw new RuntimeException("The denominator is 0");
        }
        denominator = _denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public  Fraction addition(Fraction f) {
        int num, den;
        den = denominator * f.denominator;
        num = numerator * f.denominator + f.numerator * denominator;
        Fraction resutl = new Fraction(num, den);
        return resutl;
    }

    public Fraction substraction(Fraction f) {
        int num, den;
        den = denominator * f.denominator;
        num = numerator * f.denominator - f.numerator * denominator;
        Fraction resutl = new Fraction(num, den);
        return resutl;
    }

    public Fraction multiplication(Fraction f) {
        int num, den;
        den = denominator * f.denominator;
        num = numerator * f.numerator;
        Fraction resutl = new Fraction(num, den);
        return resutl;
    }

    public Fraction division(Fraction f) {
        int num, den;
        den = denominator * f.numerator;
        num = numerator * f.denominator;
        Fraction resutl = new Fraction(num, den);
        return resutl;
    }
    private int nod(){
        int x = this.numerator;
        int y = this.denominator;
        while (x !=0 && y != 0) {
            if (x>y){
                x = x % y;
            }else {
                y = y % x;
            }
        }
        return x + y;
    }

    public void reduction() {
        int nod = this.nod();
        this.numerator = this.numerator / nod;
        this.denominator = this.denominator / nod;
    }

    public void init(int _numerator, int _denominator) {
        numerator = _numerator;

        if (_denominator == 0) {
            _denominator = 1;
        }
        denominator = _denominator;
    }

    public void print() {
        System.out.println("numerator = " + numerator);
        System.out.println("denominator = " + denominator);
    }
}
