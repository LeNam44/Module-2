package ThiThucHanh23th11;

import java.util.Scanner;

public class Main {

    public Main () {
        Scanner scanner = new Scanner(System.in);
        ProductServiceMenu productMenu = new ProductServiceMenu();
        boolean menuCheck = true;
        while (menuCheck) {
            System.out.println("Product Manager Menu");
            System.out.println("1. Show All Products");
            System.out.println("2. Add Product");
            System.out.println("3. Edit Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Sort Products");
            System.out.println("6. Find Highest Price Product");
            System.out.println("7. Exit");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    productMenu.showAllProducts();
                    break;
                case 2:
                    productMenu.formAddProduct();
                    break;
                case 3:
                    productMenu.editProduct();
                    break;
                case 4:
                    productMenu.deleteProductById();
                    break;
                case 5:
                    productMenu.sortProduct();
                    break;
                case 6:
                    productMenu.findHighestPriceProduct();
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
