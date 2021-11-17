package DSADanhSach.TrienKhaiPhuongThucLinkedList;

public class MyLinkedList1<E> {
    Node head;
    Node tail;
    int numNodes;

    public MyLinkedList1(Object data) {
        head = new Node(data);
    }

    private class Node<E> {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList1() {}

    public void add(int index, Object data) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("index " + index + " out of bounds");
        } else {
            Node temp = head;
            Node holder;
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = new Node(data);
            temp.next.next = holder;
            numNodes++;
        }
    }

    public void addFirst(E data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E e) {
        Node newNode = new Node<>(e); // Create a new node for e

        if (tail == null) {
            head = tail = newNode; // The only node in list
        }
        else {
            tail.next = newNode; // Link the new node with the last node
            tail = tail.next; // tail now points to the last node
        }

        numNodes++; // Increase size
    }

    public E removeFirst() {
        if (numNodes == 0) return null; // Nothing to delete
        else {
            Node temp = head; // Keep the first node temporarily
            head = head.next; // Move head to point to next node
            numNodes--; // Reduce size by 1
            if (head == null) tail = null; // List becomes empty
            return (E) temp; // Return the deleted element
        }
    }

    public E removeLast() {
        if (numNodes == 0) return null; // Nothing to remove
        else if (numNodes == 1) { // Only one element in the list
            Node temp = head;
            head = tail = null; // list becomes empty
            numNodes = 0;
            return (E) temp;
        } else {
            Node current = head;

            for (int i = 0; i < numNodes - 2; i++)
                current = current.next;

            Node temp = tail;
            tail = current;
            tail.next = null;
            numNodes--;
            return (E) temp;
        }
    }
    
    public E remove(int index) {
        if (index < 0 || index >= numNodes) return null; // Out of range
        else if (index == 0) return removeFirst(); // Remove first
        else if (index == numNodes - 1) return removeLast(); // Remove last
        else {
            Node previous = head;
            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }

            Node current = previous.next;
            previous.next = current.next;
            numNodes--;
            return (E) current;
        }
    }

    public int size() {
        return numNodes;
    }

    public MyLinkedList1<E> clone() {
        MyLinkedList1<E> cloneList = new MyLinkedList1<>();
        Node temp = head;
        for (int i = 0; i < numNodes && temp != null; i++) {
            cloneList.addLast((E) temp.data);
            temp = temp.next;
        }
        return cloneList;
    }

    public boolean contains(E o) {
        boolean contain = false;
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data == o) {
                contain = true;
                break;
            }
            temp = temp.next;
        }
        return contain;
    }

    public int indexOf(E o) {
        Node temp = head;
        int index = -1;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data == o) {
                index = i;
                break;
            }
            temp = temp.next;
        }
        return index;
    }

    public E get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("index " + index + " out of bounds");
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return (E) temp.data;
        }
    }

    public E getFirst() {
        return (E) head.data;
    }

    public E getLast() {
        return (E) tail.data;
    }

    public void clear() {
        head.next = null;
        head = null;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
