package com.codegym;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	    int[] arr1 = new int[5];
        int[] arr2 = new int[6];
        int[] arr3 = new int[11];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Math.round((float) Math.random()*10);
        }
        System.out.println("Mang 1 la: ");
        for (int a: arr1) {
            System.out.print(a + " ");
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Math.round((float) Math.random()*10);
        }
        System.out.println("\nMang 2 la: ");
        for (int a: arr2) {
            System.out.print(a + " ");
        }
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
        System.out.println("\nCac phan tu cua mang 3 la: ");
        for (int a: arr3) {
            System.out.print(a + " ");
        }
    }
}
