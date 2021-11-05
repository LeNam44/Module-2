import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap so hang cua mang hai chieu: ");
        int x = input.nextInt();
        System.out.println("Nhap so cot cua mang hai chieu: ");
        int y = input.nextInt();

        double[][] array = new double[x][y];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhap vao gia tri so thuc cua phan tu o vi tri [" + i + "][" + j + "]");
                array[i][j] = input.nextDouble();
            }
        }

        System.out.println("Bam muon tinh tong cua cot nao: ");
        int row = input.nextInt();
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == row) {
                    total += array[i][j];
                }
            }
        }
        System.out.println("Tong cua cot " + row + " la: " + total);
    }
}
