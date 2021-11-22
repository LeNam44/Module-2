package JavaCollectionFramework.LuyenTapDungALvaLL.DungLinkedList;

import java.util.Scanner;

public class ProductServiceMenu {
    Scanner scanner = new Scanner(System.in);
    ProductManager productManager = new ProductManager();

    public void formAddProduct() {
        boolean checkAdd = true;
        while (checkAdd) {
            System.out.println("Input product name: ");
            String productName = scanner.nextLine();
            System.out.println("Input price: ");
            int price = scanner.nextInt();
            Product product = new Product(productName, price);
            productManager.addProduct(product);

            System.out.println("Enter any key to continue or QUIT to return to Menu");
            String continueOrQuit = scanner.next();
            if (continueOrQuit.equalsIgnoreCase("quit")) {
                new Main();
            }
        }
    }

    public void formEditProduct() {
        boolean checkEdit = true;
        while (checkEdit) {
            System.out.println("Enter ID: ");
            int index = scanner.nextInt();
            System.out.println("Edit product name: ");
            scanner.nextLine();
            String productName = scanner.nextLine();
            System.out.println("Edit price: ");
            int price = scanner.nextInt();
            Product product = new Product(productName, price);
            productManager.editProduct(index, product);

            System.out.println("Enter any key to continue or QUIT to return to Menu");
            String continueOrQuit = scanner.next();
            if (continueOrQuit.equalsIgnoreCase("quit")) {
                new Main();
            }
        }
    }

    public void showAllProduct() {
        productManager.showProductList();
    }

    public void deleteProductById() {
        boolean checkDelete = true;
        while (checkDelete) {
            System.out.println("Input delete ID: ");
            int index = scanner.nextInt();
            productManager.deleteProduct(index-1);

            System.out.println("Enter any key to continue or QUIT to return to Menu");
            String continueOrQuit = scanner.next();
            if (continueOrQuit.equalsIgnoreCase("quit")) {
                new Main();
            }
        }
    }

    public void formFindProductById() {
        boolean checkFind = true;
        while (checkFind) {
            System.out.println("Enter ID: ");
            int index = scanner.nextInt();
            System.out.println(productManager.findProductById(index));

            System.out.println("Enter any key to continue or QUIT to return to Menu");
            String continueOrQuit = scanner.next();
            if (continueOrQuit.equalsIgnoreCase("quit")) {
                new Main();
            }
        }
    }

    public void sortProducts() {
        boolean checkSort = true;
        while (checkSort) {
            System.out.println("1. Ascending Sort");
            System.out.println("2. Descending Sort");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    productManager.sortProductAscending();
                    System.out.println("Product Sorted (ascending)");
                    break;
                case 2:
                    productManager.sortProductDescending();
                    System.out.println("Product Sorted (descending)");
                    break;
            }

            System.out.println("Enter any key to continue or QUIT to return to Menu");
            String continueOrQuit = scanner.next();
            if (continueOrQuit.equalsIgnoreCase("quit")) {
                new Main();
            }
        }

    }
}
