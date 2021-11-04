package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input numbers of prime numbers: ");
        int count = 0, numbers = input.nextInt(), n = 2;
        boolean check = true;
        while(count < numbers) {
            for ( int i = 2 ; i <= Math.sqrt(n) ; i++) {
                if ( n % i == 0 ) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(n);
                count++;
            }
            check = true;
            n++;
        }
    }
}
