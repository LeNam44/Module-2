package baitap6th11;

public class Bai2 {
    public static void main(String[] args) {
        int n = 10, total = 0;
        while (n < 50) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(n) ; i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                total += n;
            }
            n++;
        }
        System.out.println("Tong cua cac snt tu 10 den 50 la " + total);
    }
}
