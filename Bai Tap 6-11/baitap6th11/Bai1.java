package baitap6th11;

public class Bai1 {
    public static void main(String[] args) {
        int n = 11, count = 0;
        while (count < 20) {
            if (n % 5 == 0) {
//                System.out.println(n);
                count++;
            }
            n++;
        }
        System.out.println("So o vi tri 20 chia het cho 5 tinh tu 11 la " + (n-1));
    }
}
