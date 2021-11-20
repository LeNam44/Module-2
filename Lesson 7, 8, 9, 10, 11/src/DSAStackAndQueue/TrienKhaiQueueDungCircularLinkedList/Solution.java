package DSAStackAndQueue.TrienKhaiQueueDungCircularLinkedList;

public class Solution {
    static void enqueue(Queue q, int data) {
        Node newNode = new Node(data);
        newNode.data = data;
        if (q.front == null)
            q.front = newNode;
        else
            q.rear.link = newNode;

        q.rear = newNode;
        q.rear.link = q.front;
    }

    public static int dequeue(Queue q) {
        if (q.front ==  null)
        {
            System.out.printf ("Queue is empty");
            return Integer.MIN_VALUE;
        }

        // If this is the last node to be deleted
        int data;
        if (q.front == q.rear)
        {
            data = q.front.data;
            q.front =  null;
            q.rear =  null;
        }
        else  // There are more than one nodes
        {
            Node  temp = q.front;
            data = temp .data;
            q.front = q.front.link;
            q.rear .link= q.front;
        }

        return data;
    }

    public static void displayQueue(Queue q) {
        Node temp = q.front;
        System.out.print(" Elements in Circular Queue are: ");
        while (temp.link != q.front)
        {
            System.out.printf("%d ", temp.data);
            temp = temp.link;
        }
        System.out.printf("%d", temp.data);
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.front = q.rear = null;

        enqueue(q, 14);
        enqueue(q, 15);
        enqueue(q, 16);
        enqueue(q, 17);

        displayQueue(q);

        dequeue(q);
        System.out.println();
        displayQueue(q);
        enqueue(q, 18);
        enqueue(q, 19);
        System.out.println();
        displayQueue(q);
        dequeue(q);
        dequeue(q);
        System.out.println();
        displayQueue(q);
    }
}
