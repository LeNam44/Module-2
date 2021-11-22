package JavaCollectionFramework.LuyenTapDungALvaLL;

public class Product {
    private int id;
    private String productName;
    private int price;
    private static int idNumber;

    public Product() {}

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
        id = ++idNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "(id: " + id + ") " + "Name: " + productName + " | Price: " + price + "\n";
    }
}
