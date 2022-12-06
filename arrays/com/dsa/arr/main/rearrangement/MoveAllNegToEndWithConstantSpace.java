package com.dsa.arr.main.rearrangement;

import com.dsa.arr.main.util.ArrayUtils;

public class MoveAllNegToEndWithConstantSpace {
    public void moveAllNegToStart(int[] arr) {
        int length = arr.length, start = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                int j = i;
                while (j > start) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
                start++;
            }
        }
        ArrayUtils.printArr(arr);
    }

    public static void test() {
        int[] arr = {12, 11, -13, -5, 6, -7, 5, -3, -6};
        new MoveAllNegToEndWithConstantSpace().moveAllNegToStart(arr);
    }
}