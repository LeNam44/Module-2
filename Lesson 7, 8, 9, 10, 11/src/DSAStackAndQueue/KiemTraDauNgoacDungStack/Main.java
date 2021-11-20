package DSAStackAndQueue.KiemTraDauNgoacDungStack;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static boolean checkParenthesis(String equation) {
        Stack<Character> bStack = new Stack<>();
        for (int i = 0; i < equation.length(); i++) {
            Character sym = equation.charAt(i);
            if (sym.equals('(')) {
                bStack.push(sym);
            } else if (sym.equals(')')) {
                if (bStack.isEmpty()) {
                    return false;
                } else {
                    Character left = bStack.pop();
                }
            }
        }

        if (bStack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input equation: ");
        String equation = scanner.nextLine();

        if (checkParenthesis(equation)) {
            System.out.println("Good");
        } else {
            System.out.println("NOT Good");
        }
    }
}
