package DSAStackAndQueue.ChuyenDoiHeThapPhanSangNhiPhan;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        System.out.println("Enter a decimal number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while (number > 0) {
            int remainder = number % 2;

            stack.push(remainder);
            number = number / 2;
        }
        System.out.println("Binary number is ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
