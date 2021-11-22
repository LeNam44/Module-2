package JavaCollectionFramework.LuyenTapDungALvaLL.DungLinkedList;

import java.util.Scanner;

public class LinkedList<E> {
    Node head;
    int size;

    Scanner scanner = new Scanner(System.in);
    public void addProduct(Product productData) {
        if (head == null) {
            head = new Node(productData);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(productData);
        size++;
    }

    public boolean checkIndex(int index) {
        if (index <= 0 || index > size) {
            return false;
        } else {
            return true;
        }
    }

    public void deleteProductById(int index) {
        if (checkIndex(index-1)) {
            Node current = head;
            if (index == 1) {
                head = current.next;
            } else {
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                if (current.next.next == null) {
                    current.next = null;
                } else {
                    current.next = current.next.next;
                }
            }
        }
    }

    public Product findProductById(int index) {
        if (!checkIndex(index-1)) {
            throw new IndexOutOfBoundsException("index " + index + " out of bounds");
        } else {
            Node current = head;
            if (index == 1) {
                return head.productData;
            } else {
                for (int i = 0; i < index-1; i++) {
                    current = current.next;
                }
                return current.productData;
            }
        }
    }

    public void editProductById(int index, Product product) {
        if (!checkIndex(index-1)) {
            throw new IndexOutOfBoundsException("index " + index + " out of bounds");
        } else {
            Node current = head;
            for (int i = 0; i < index-1; i++) {
                current = current.next;
            }
            current.productData.setProductName(product.getProductName());
            current.productData.setPrice(product.getPrice());
        }
    }

    public void sortProductAscending() {
        Node current = head;
        Node nextCurrent;

        Product temp;
        if (head == null) {
            return;
        }
        else {
            while (current != null) {
                nextCurrent = current.next;

                while (nextCurrent != null) {
                    if (current.productData.getPrice() > nextCurrent.productData.getPrice()) {
                        temp = current.productData;
                        current.productData = nextCurrent.productData;
                        nextCurrent.productData = temp;
                    }

                    nextCurrent = nextCurrent.next;
                }
                current = current.next;
            }
        }
    }

    public void sortProductDescending() {
        Node current = head;
        Node nextCurrent = null;

        Product temp;
        if (head == null) {
            return;
        }
        else {
            while (current != null) {
                nextCurrent = current.next;

                while (nextCurrent != null) {
                    if (current.productData.getPrice() < nextCurrent.productData.getPrice()) {
                        temp = current.productData;
                        current.productData = nextCurrent.productData;
                        nextCurrent.productData = temp;
                    }

                    nextCurrent = nextCurrent.next;
                }
                current = current.next;
            }
        }
    }


    public void printList(){
        System.out.println("Product List: ");
        Node current = head;
        while(current != null){
            System.out.println(current);
            current = current.next;
        }

    }
}
