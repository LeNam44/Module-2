package ThiThucHanh23th11;

public class Product {
    private int id;
    private String productName;
    private int price;
    private int amount;
    private String description;
    private static int idNumber;

    public Product() {}

    public Product(String productName, int price, int amount, String description) {
        this.productName = productName;
        this.price = price;
        this.amount = amount;
        this.description = description;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "(id: " + id + ") " + "Name: " + productName + " | Price: " + price + " | Amount: " + amount + " | Description: " + description + "\n";
    }
}
