package JavaCollectionFramework.LuyenTapDungALvaLL.DungLinkedList;

public class ProductManager {
    public static LinkedList<Product> productLinkedList = new LinkedList<Product>();

    static {
        productLinkedList.addProduct(new Product("Tra Tac", 15000));
        productLinkedList.addProduct(new Product("Tra Chanh", 12000));
        productLinkedList.addProduct(new Product("Tra Da", 5000));
        productLinkedList.addProduct(new Product("Tra Dao", 30000));
    }

    public void addProduct(Product product) {
        productLinkedList.addProduct(product);
    }

    public void showProductList() {
        productLinkedList.printList();
    }

    public Product findProductById(int index) {
        return productLinkedList.findProductById(index);
    }

    public void editProduct(int index, Product product) {
        productLinkedList.editProductById(index, product);
    }

    public void deleteProduct(int index) {
        productLinkedList.deleteProductById(index);
    }

    public void sortProductAscending() {
        productLinkedList.sortProductAscending();
    }
    public void sortProductDescending() {
        productLinkedList.sortProductDescending();
    }

}
