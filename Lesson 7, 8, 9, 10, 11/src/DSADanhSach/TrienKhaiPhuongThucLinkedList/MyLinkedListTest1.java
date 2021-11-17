package DSADanhSach.TrienKhaiPhuongThucLinkedList;

public class MyLinkedListTest1 {
    public static void main(String[] args) {
        MyLinkedList1<Integer> mll = new MyLinkedList1<>();
        mll.addLast(1);
        mll.addLast(2);
        mll.addLast(3);
        mll.addLast(4);
        mll.addLast(5);
        mll.addLast(6);

        mll.remove(3);
        mll.printList();
        System.out.println("size is " + mll.size());
        mll.clone().printList();
        System.out.println("Check contain: " + mll.contains(3));
        System.out.println("Check index: " + mll.indexOf(6));
        System.out.println("Get by index: " + mll.get(3));
        System.out.println("Get First: " + mll.getFirst());
        System.out.println("Get Last: " + mll.getLast());
        mll.clear();
        mll.printList();
    }
}
