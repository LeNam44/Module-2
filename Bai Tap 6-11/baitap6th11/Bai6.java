package baitap6th11;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chao mung ban den voi game Ai La Trieu Phu!");
        System.out.println("Cau hoi: Lop C0921K1 co bao nhieu ban nu?");
        System.out.println("1. 1 Ban");
        System.out.println("2. 2 Ban");
        System.out.println("3. 3 Ban");
        System.out.println("4. 4 Ban");
        System.out.println("Cau tra loi cua ban la: ");
        int answer = scanner.nextInt();

        switch (answer) {
            case 1:
                System.out.println("Sai roi");
                break;
            case 2:
                System.out.println("Sai roi");
                break;
            case 3:
                System.out.println("Dung roi!");
                break;
            case 4:
                System.out.println("Sai roi");
                break;
            default:
                System.out.println("Cau tra loi khong hop le");
                break;
        }
    }
}
