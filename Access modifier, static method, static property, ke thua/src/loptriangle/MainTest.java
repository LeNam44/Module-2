package loptriangle;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //test shape

        System.out.println("Nhap mau cua hinh: ");
        String colorShape = input.nextLine();

        Shape shape = new Shape(colorShape);
        System.out.println(shape);
        //test triangle

        System.out.println("Nhap mau sac cua tam giac: ");
        String color = input.nextLine();
        System.out.println("Nhap do dai canh 1: ");
        double side1 = input.nextDouble();
        System.out.println("Nhap do dai canh 2: ");
        double side2 = input.nextDouble();
        System.out.println("Nhap do dai canh 3: ");
        double side3 = input.nextDouble();

        Triangle triangle = new Triangle(side1, side2, side3, color);
        System.out.println(triangle);
    }
}
