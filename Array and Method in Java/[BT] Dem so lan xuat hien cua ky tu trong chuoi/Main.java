import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap chuoi: ");
        String inputString = input.nextLine();

        System.out.println("Nhap ky tu can dem: ");
        char character = input.next().charAt(0);

        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("So lan xuat hien cua ky tu " + character + " la " + count + " lan");
    }
}
