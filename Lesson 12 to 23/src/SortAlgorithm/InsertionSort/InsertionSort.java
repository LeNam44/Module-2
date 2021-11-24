package SortAlgorithm.InsertionSort;

public class InsertionSort {
    static int[] list = {9,1,3,5,7,6,8,2,4};

    public static void insertionSort(int[] list) {
        int temp, pos;
        for (int i = 1; i < list.length; i++) {
            temp = list[i];
            pos = i;
            while (pos > 0 && temp < list[pos-1]) {
                list[pos] = list[pos-1];
                pos--;
            }
            list[pos] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.print("List before sort:");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        insertionSort(list);
        System.out.println();
        System.out.print("List after sort: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }
}
