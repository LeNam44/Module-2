package JavaCollectionFramework.LuyenTapDungALvaLL;

import java.util.Scanner;

public class ProductServiceMenu {
    Scanner scanner = new Scanner(System.in);
    ProductManager productManager = new ProductManager();
    public void formAddProduct() {
        boolean checkAdd = true;
        while (checkAdd) {
            System.out.println("Input product name: ");
            String productName = scanner.nextLine();

            System.out.println("Input product price: ");
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

    public void showAllProducts() {
        productManager.showProductList();
    }

    public void findById() {
        boolean checkProduct = true;
        while (checkProduct) {
            System.out.println("Enter ID to find: ");
            int id = scanner.nextInt();
            if (productManager.checkID(id)) {
                Product product = productManager.findProductById(id-1);
                System.out.println(" " + product.getId() + " " + product.getProductName() + " " + product.getPrice());
            } else {
                System.out.println("ID is not found");
            }
            System.out.println("Enter any key to continue or QUIT to return to Menu");
            String continueOrQuit = scanner.next();
            if (continueOrQuit.equalsIgnoreCase("quit")) {
                new Main();
            }
        }
    }

    public void deleteProductById() {
        boolean checkDelete = true;
        while (checkDelete) {
            System.out.println("Enter ID to delete: ");
            int deleteId = scanner.nextInt();
            if (productManager.checkID(deleteId)) {
                productManager.deleteById(deleteId - 1);
                System.out.println("Product Deleted");
            } else {
                System.out.println("Id not found");
            }
            System.out.println("Enter any key to continue or QUIT to return to Menu");
            String continueOrQuit = scanner.next();
            if (continueOrQuit.equalsIgnoreCase("quit")) {
                new Main();
            }
        }
    }

    public void editProductById() {
        boolean checkEdit = true;
        while (checkEdit) {
            System.out.println("Enter ID to edit: ");
            int editId = scanner.nextInt();
            if (productManager.checkID(editId)) {
                System.out.println("Edit name: ");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.println("Edit price: ");
                int price = scanner.nextInt();
                productManager.editProduct(editId-1, name, price);
                System.out.println("Product edited");
            } else {
                System.out.println("Id not found");
            }
            System.out.println("Enter any key to continue or QUIT to return to Menu");
            String continueOrQuit = scanner.next();
            if (continueOrQuit.equalsIgnoreCase("quit")) {
                new Main();
            }
        }
    }

    public void sortProduct() {
        boolean checkSort = true;
        while (checkSort) {
            System.out.println("1. Sort Ascending");
            System.out.println("2. Sort Descending");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    productManager.sortProductsAscending();
                    break;
                case 2:
                    productManager.sortProductsDescending();
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
