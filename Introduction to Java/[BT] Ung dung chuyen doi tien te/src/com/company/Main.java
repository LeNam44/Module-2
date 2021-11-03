package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input USD money amount: ");
        usd = scanner.nextDouble();
        double convert = usd * 23000;
        System.out.println("VND is: " + convert);
    }
}
