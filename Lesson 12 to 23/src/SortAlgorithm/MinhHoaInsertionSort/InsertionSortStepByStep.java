package SortAlgorithm.MinhHoaInsertionSort;

public class InsertionSortStepByStep {
    static int[] list = {9, 1, 8, 2, 7, 3, 6, 5, 4};

    public static void main(String[] args) {
        System.out.print("List before sorting: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }

        System.out.println("\nBegin insertion sorting...");
        InsertionSortByStep(list);
    }

    public static void InsertionSortByStep(int[] list) {
        int temp, pos;
        for (int i = 1; i < list.length; i++) {
            temp = list[i];
            pos = i;
            while (pos > 0 && temp < list[pos - 1]) {
                System.out.println("Swap position " + pos + " with " + (pos+1));
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = temp;

            System.out.print("List after the " + i + " sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print("(pos " + (j+1) + ")" + list[j] + "\t");
            }
            System.out.println();
        }
    }
}
