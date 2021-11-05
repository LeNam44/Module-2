package findminin2darray;

import java.util.Scanner;

public class FindMinIn2dArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap so hang trong ma tran: ");
        int x = input.nextInt();
        System.out.println("Nhap so cot trong ma tran: ");
        int y = input.nextInt();
        int[][] array = new int[x][y];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhap phan tu o vi tri [" + i + "][" + j + "]");
                array[i][j] = input.nextInt();
            }
        }

        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        System.out.println("Gia tri nho nhat la " + min);
    }
}
