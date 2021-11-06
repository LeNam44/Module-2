package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String number1 = "1";
        int number2 = 12;
        System.out.println(number1+number2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đọc :");
        int so = scanner.nextInt();

        if (so >= 10) {
            while (so >= 10) {
                show(so % 10);
                so = so / 10;
            }
            show(1);
        }else {
            show(so);
        }
    }

    public static void show(int so) {
        switch (so) {
            case 0:
                System.out.print("không ");
                break;
            case 1:
                System.out.print("một ");
                break;
            case 2:
                System.out.print("hai ");
                break;
            case 3:
                System.out.print("ba ");
                break;
            case 4:
                System.out.print("bốn ");
                break;
            case 5:
                System.out.print("năm ");
                break;
            case 6:
                System.out.print("sáu ");
                break;
            case 7:
                System.out.print("bảy ");
                break;
            case 8:
                System.out.print("tám ");
                break;
            case 9:
                System.out.print("chín ");
                break;
        }
    }
}