package com.company;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        numerator = 0;
        denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;

        setDenominator(denominator);
    }

    public void printInfo() {
        System.out.println(numerator + "/" + denominator);
    }

    public void input()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        numerator = scanner.nextInt();

        System.out.print("Enter denominator: ");
        denominator = scanner.nextInt();
    }

    public void input(Scanner scanner)
    {
        System.out.print("Enter numerator: ");
        numerator = scanner.nextInt();

        System.out.print("Enter denominator: ");
        denominator = scanner.nextInt();
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator == 0 ? 1 : denominator;
    }

    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            return new Fraction(this.numerator, this.denominator);
        }

        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction add(int number) {
        return new Fraction(this.numerator + number * this.denominator, this.denominator);
    }

    public Fraction subtract(int number) {
        return new Fraction(this.numerator - number * this.denominator, this.denominator);
    }

    public Fraction multiply(int number) {
        return new Fraction(this.numerator * number, this.denominator);
    }

    public Fraction divide(int number) {
        return number == 0 ? this : new Fraction(this.numerator, this.denominator * number);
    }

}
