package baitap6th11;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so can kiem tra xem co la so nguyen to: ");
        int input = scanner.nextInt();

        boolean check = true;
        if (input == 1 || input == 0) {
            check = false;
            System.out.println("So " + input + " khong phai la so nguyen to");
        } else if (input == 2) {
            check = true;
        } else {
            for (int i = 2; i <= Math.sqrt(input) ; i++) {
                if (input % i == 0) {
                    check = false;
                    System.out.println("So " + input + " khong phai la so nguyen to");
                    break;
                }
            }
        }
        if (check) {
            System.out.println("So " + input + " la so nguyen to");
        }
    }
}

