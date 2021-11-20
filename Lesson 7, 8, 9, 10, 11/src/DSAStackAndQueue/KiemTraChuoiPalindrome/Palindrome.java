package DSAStackAndQueue.KiemTraChuoiPalindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the String: ");

        while (true) {

            String line = input.nextLine();

            Stack<Character> stack = new Stack<Character>();
            Queue<Character> queue = new LinkedList<Character>();

            for (int i = 0; i < line.length(); i++) {
                stack.push(line.toLowerCase().charAt(i));
            }

            for (int i = 0; i < line.length(); i++) {
                queue.add(line.toLowerCase().charAt(i));
            }

            boolean isPalindrome = true;
            while (!queue.isEmpty()) {
                Character qChar = queue.remove();
                Character sChar = stack.pop();
                if (qChar.equals(sChar)) {
                    continue;
                } else {
                    isPalindrome = false;
                    break;
                }
            }

            if (!isPalindrome) {
                System.out.println("Not a Palindrome");
            } else {
                System.out.println("Palindrome");
            }

            if (line.equals("quit")) {
                break;
            }
        }
    }
}
