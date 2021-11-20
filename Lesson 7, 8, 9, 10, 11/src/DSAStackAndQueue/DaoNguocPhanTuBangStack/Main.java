package DSAStackAndQueue.DaoNguocPhanTuBangStack;

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Dao nguoc phan tu so nguyen trong mang
        Stack<Integer> stack = new Stack<>();
        int[] intArray = new int[5];
        int num = 5;
        for (int i = 0; i < intArray.length && num > 0; i++, num--) {
            intArray[i] = num;
        }
        System.out.println(Arrays.toString(intArray));

        for (int i = 0; i < intArray.length; i++) {
            stack.push(intArray[i]);
        }
        System.out.println(stack.toString());

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = stack.pop();
        }
        System.out.println(Arrays.toString(intArray));

        // Dao nguoc chuoi trong mang
        Stack<String> wStack = new Stack<>();
        String mWord = "The quick brown fox jumps over the lazy dog";
        String[] mWordArr = mWord.split(" ");
        for (int i = 0; i < mWordArr.length; i++) {
            wStack.push(mWordArr[i]);
        }
        System.out.println();
        System.out.println(wStack);

        for (int i = 0; i < mWordArr.length; i++) {
            mWordArr[i] = wStack.pop();
        }
        System.out.println(Arrays.toString(mWordArr));
    }


}
