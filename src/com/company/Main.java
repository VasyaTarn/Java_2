package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human human = RandomFactory.randomHuman();
        human.printInfo();

        Fraction fr1 = RandomFactory.randomFraction();
        Fraction fr2 = RandomFactory.randomFraction();

        System.out.println();

        fr1.printInfo();
        fr2.printInfo();
        System.out.println("----------");
        fr1.add(fr2).printInfo();
        fr1.divide(fr2).printInfo();
        fr1.multiply(fr2).printInfo();
        fr1.subtract(fr2).printInfo();
    }
}