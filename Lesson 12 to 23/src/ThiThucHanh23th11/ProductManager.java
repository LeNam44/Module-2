package ThiThucHanh23th11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);

    public static ArrayList<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product("Hong Tra", 25000, 30, "Tra co mau hong ngoc"));
        productList.add(new Product("Hong Tra Chanh", 12000, 45, "Hong tra vi chanh"));
        productList.add(new Product("Hong Tra Tac", 20000, 35, "Hong tra vi quat"));
        productList.add(new Product("Tra Sua", 15000, 25, "Tra pha voi sua tuoi"));
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

    public void editProduct(int id ,String productName, int price, int amount, String description) {
        findProductById(id).setProductName(productName);
        findProductById(id).setPrice(price);
        findProductById(id).setAmount(amount);
        findProductById(id).setDescription(description);
    }

    public int comparePriceAscending(Product p1, Product p2) {
        return (p1.getPrice() - p2.getPrice());
    }

    public int comparePriceDescending(Product p1, Product p2) {
        return (p2.getPrice() - p1.getPrice());
    }

    public int compareAmountAscending(Product p1, Product p2) {
        return (p1.getAmount() - p2.getAmount());
    }

    public int compareAmountDescending(Product p1, Product p2) {
        return (p2.getAmount() - p1.getAmount());
    }

    public void sortPriceAscending() {
        Collections.sort(productList, this::comparePriceAscending);
    }

    public void sortPriceDescending() {
        Collections.sort(productList, this::comparePriceDescending);
    }

    public void sortAmountAscending() {
        Collections.sort(productList, this::compareAmountAscending);
    }

    public void sortAmountDescending() {
        Collections.sort(productList, this::compareAmountDescending);
    }

    public int compareId(Product p1, Product p2) {
        return (p1.getId() - p2.getId());
    }

    public void sortById() {
        Collections.sort(productList, this::compareId);
    }

    public Product findHightestPrice() {
        sortPriceDescending();
        return findProductById(0);
    }
}
