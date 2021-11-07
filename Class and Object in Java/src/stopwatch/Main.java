package stopwatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Đồng hồ đếm");
            System.out.println("1. Start");
            System.out.println("2. Stop");
            System.out.println("3. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Dong ho dang dem! Hien tai la " + stopWatch.start());
                    break;
                case 2:
                    System.out.println("Thoi gian ket thuc la " + stopWatch.stop());
                    System.out.println("So mili giay da troi qua la " + stopWatch.getElapsedTime());
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Lua chon khong hop le");
            }
        }
    }
}
