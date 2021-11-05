package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = {1, 2, 3, 4, 5, 0};
        System.out.println("Mang bao gom: ");
        for (int a: arr) {
            System.out.print(a + " ");
        }
        System.out.println("\nNhap phan tu can them: ");
        int x = scanner.nextInt();
        System.out.println("Nhap vi tri can chen: ");
        int index_add = scanner.nextInt();
        if (index_add <= -1 || index_add >= newArr.length) {
            System.out.println("Khong chen duoc phan tu vao mang!");
        } else {
            for (int i = 0; i < arr.length + 1; i++) {
                if (i < index_add - 1)
                    newArr[i] = arr[i];
                else if (i == index_add - 1)
                    newArr[i] = x;
                else
                    newArr[i] = arr[i - 1];
            }
            System.out.println("Mang sau khi them phan tu la: ");
            for (int a: newArr) {
                System.out.print(a + " ");
            }
        }
    }
}
