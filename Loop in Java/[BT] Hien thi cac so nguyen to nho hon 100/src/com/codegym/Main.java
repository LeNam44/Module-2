package com.codegym;

public class Main {

    public static void main(String[] args) {
        boolean check = true;
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(i);
            }
            check = true;
        }
    }
}
