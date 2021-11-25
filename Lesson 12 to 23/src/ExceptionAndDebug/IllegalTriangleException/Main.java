package ExceptionAndDebug.IllegalTriangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap canh a: ");
        int side1 = scanner.nextInt();
        System.out.println("Nhap canh b: ");
        int side2 = scanner.nextInt();
        System.out.println("Nhap canh c: ");
        int side3 = scanner.nextInt();
        CreateTriangle createTriangle;
        try {
            createTriangle = new CreateTriangle(side1,side2,side3);
            System.out.println("Tam giac hop le");
        } catch (IllegalTriangleException e) {
            System.out.println("Khong phai la tam giac hop le");
        }

    }
}
