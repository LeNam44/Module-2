package JavaCollectionFramework.LuyenTapDungALvaLL.DungArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);

    public static ArrayList<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product("Hong Tra", 25000));
        productList.add(new Product("Hong Tra Chanh", 12000));
        productList.add(new Product("Hong Tra Tac", 20000));
        productList.add(new Product("Tra Sua", 15000));
    }

    public ArrayList<Product> findAll() {
        return productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void showProductList() {
        System.out.println(productList);
    }

    public Product findProductById(int id) {
        return productList.get(id);
    }

    public boolean checkID(int id) {
        if (id <= 0 || id >= productList.size()) {
            return false;
        } else {
            return true;
        }
    }

    public void deleteById(int id) {
        productList.remove(id);
    }

    public void editProduct(int id ,String productName, int price) {
        findProductById(id).setProductName(productName);
        findProductById(id).setPrice(price);
    }

    public int compareAscending(Product p1, Product p2) {
        return (p1.getPrice() - p2.getPrice());
    }

    public int compareDescending(Product p1, Product p2) {
        return (p2.getPrice() - p1.getPrice());
    }

    public void sortProductsAscending() {
        Collections.sort(productList, this::compareAscending);
    }

    public void sortProductsDescending() {
        Collections.sort(productList, this::compareDescending);
    }
}
