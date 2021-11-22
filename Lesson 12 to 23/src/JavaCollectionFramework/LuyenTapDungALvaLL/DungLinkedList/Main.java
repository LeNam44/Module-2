package JavaCollectionFramework.LuyenTapDungALvaLL.DungLinkedList;

import java.util.Scanner;

public class Main {
    public Main() {
        Scanner scanner = new Scanner(System.in);
        ProductServiceMenu productMenu = new ProductServiceMenu();
        boolean menuCheck = true;
        while (menuCheck) {
            System.out.println("Product Manager Menu");
            System.out.println("1. Add Product");
            System.out.println("2. Edit Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Show All Products");
            System.out.println("5. Find Product");
            System.out.println("6. Sort Products");
            System.out.println("7. Exit");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    productMenu.formAddProduct();
                    break;
                case 2:
                    productMenu.formEditProduct();
                    break;
                case 3:
                    productMenu.deleteProductById();
                    break;
                case 4:
                    productMenu.showAllProduct();
                    break;
                case 5:
                    productMenu.formFindProductById();
                    break;
                case 6:
                    productMenu.sortProducts();
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
