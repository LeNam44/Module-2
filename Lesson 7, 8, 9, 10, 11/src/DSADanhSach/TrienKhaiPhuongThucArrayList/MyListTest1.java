package DSADanhSach.TrienKhaiPhuongThucArrayList;

public class MyListTest1 {
    public static void main(String[] args) {
        MyList1<Integer> ml = new MyList1<>(20);
        ml.add(0,4);
        ml.add(1,5);
        ml.add(2,6);

        System.out.println(ml);
        System.out.println(ml.size());
        System.out.println(ml.contains(2));
        System.out.println(ml.indexOf(10));
        ml.add(7);
        System.out.println(ml);
        System.out.println(ml.get(2));
        System.out.println(ml.remove(0));
        System.out.println(ml);
        ml.clear();
        System.out.println(ml);
    }

}
