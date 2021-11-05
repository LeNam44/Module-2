package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println("Mang bao gom: ");
        for (int a: arr) {
            System.out.print(a + " ");
        }
        System.out.println("\nNhap phan tu can xoa: ");
        int x = scanner.nextInt();
        int index_del = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index_del = i;
            }
        }
        for (int i = index_del; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
            arr[i+1] = 0;
        }
        System.out.println("Mang sau khi xoa la: ");
        for (int a: arr) {
            System.out.print(a + " ");
        }
    }
}
