package baitap6th11;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Math.round((float) Math.random() * 10);
        int check = 1;

        do {
            System.out.println("Nhap so ban doan: ");
            int userInput = input.nextInt();
            if (userInput == number) {
                check = 0;
                System.out.println("Ban da doan dung!");
            } else if (userInput < number) {
                System.out.println("Ban doan sai, hay doan so lon hon!");
            } else if (userInput > number) {
                System.out.println("Ban doan sai, hay doan so nho hon");
            }
        } while (check == 1);
    }
}
