package findminin2darray;

import java.util.Scanner;

public class FindMinIn2dArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap chieu dai cua mang khoi tao: ")
        int size = input.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhap gia tri phan tu o vi tri " + i)
            array[i] = input.nextInt();
        }

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Gia tri nho nhat la " + min);
    }
}
