package baitap6th11;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap gia tri cua a:");
        double a = input.nextDouble();
        System.out.println("Nhap gia tri cua b:");
        double b = input.nextDouble();
        System.out.println("Nhap gia tri cua c: ");
        double c = input.nextDouble();

        double delta = Math.pow(b, 2) - (4*a*c);
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            System.out.println("Phuong trinh co nghiem kep la x1 = x2 = " + (-b/2*a));
        } else if (delta > 0) {
            System.out.println("Phuong trinh co hai nghiem: x1 = " + (-b + Math.sqrt(delta))/2*a + " va x2 = " + (-b - Math.sqrt(delta))/2*a);
        }
    }

}
