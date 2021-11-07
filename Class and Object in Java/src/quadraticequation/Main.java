package quadraticequation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a: ");
        double a = input.nextDouble();
        System.out.println("Input b: ");
        double b = input.nextDouble();
        System.out.println("Input c: ");
        double c = input.nextDouble();

        QuadraticEquation calculator = new QuadraticEquation(a, b, c);
        if (calculator.getDiscriminant() < 0) {
            System.out.println("The equation has no real roots");
        } else if (calculator.getDiscriminant() == 0) {
            System.out.println("The equation has one root " + calculator.getRoot1());
        } else if (calculator.getDiscriminant() > 0) {
            System.out.println("The equation has two root: " + calculator.getRoot1() + " and " + calculator.getRoot2());
        }
    }
}
