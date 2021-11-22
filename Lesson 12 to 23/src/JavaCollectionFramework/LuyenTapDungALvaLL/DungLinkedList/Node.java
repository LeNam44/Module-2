package JavaCollectionFramework.LuyenTapDungALvaLL.DungLinkedList;

public class Node {
    Product productData;
    Node next;

    public Node(Product productData) {
        this.productData = productData;
    }

    @Override
    public String toString() {
        return productData.toString();
    }
}
