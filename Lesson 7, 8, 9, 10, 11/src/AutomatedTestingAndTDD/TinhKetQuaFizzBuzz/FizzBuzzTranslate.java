package AutomatedTestingAndTDD.TinhKetQuaFizzBuzz;

import java.util.Scanner;

public class FizzBuzzTranslate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a number: ");
        int inputNumber = scanner.nextInt();
        System.out.println(translateFizzBuzz(inputNumber));
    }

    public static String translateFizzBuzz(int inputNumber) {
        boolean isDivisibleBy3 = inputNumber % 3 == 0;
        boolean isGreaterThan0 = inputNumber > 0;
        boolean isDivisibleBy5 = inputNumber % 5 == 0;
        boolean has3 = String.valueOf(inputNumber).contains("3");
        boolean has5 = String.valueOf(inputNumber).contains("5");
        if (isGreaterThan0) {
            if (isDivisibleBy3 && isDivisibleBy5) {
                return "FizzBuzz";
            } else if (isDivisibleBy3 || has3) {
                return "Fizz";
            } else if (isDivisibleBy5 || has5) {
                return "Buzz";
            } else {
                return showNumber(inputNumber);
            }
        } else {
            return "No FizzBuzz";
        }
    }

    public static String showNumber(int inputNumber) {
        if (inputNumber > 10 && inputNumber < 100) {
            return readNumber(inputNumber / 10) + " " +  readNumber(inputNumber % 10);
        } else {
            return readNumber(inputNumber);
        }
    }

    public static String readNumber(int inputNumber) {
        switch (inputNumber) {
            case 1:
                return "một";
            case 2:
                return "hai";
            case 3:
                return "ba";
            case 4:
                return "bốn";
            case 5:
                return "năm";
            case 6:
                return "sáu";
            case 7:
                return "bảy";
            case 8:
                return "tám";
            case 9:
                return "chín";
            default:
                return "Can't read";
        }
    }
}
