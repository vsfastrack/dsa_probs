package com.dsa.arr.main.search;

import com.dsa.arr.main.util.ArrayUtils;

public class LostElement {
    public int findLostElement(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        if (Math.abs(length1 - length2) != 1)
            return -1;
        int lostElement = -1;
        int limit = Math.min(length1, length2), i = 0;
        for (; i < limit; i++) {
            if (arr1[i] != arr2[i]) {
                lostElement = arr1[i];
                break;
            }
        }
        if (lostElement == -1) {
            if (length1 > length2)
                lostElement = arr1[length1 - 1];
            else
                lostElement = arr2[length2 - 1];
        }
        return lostElement;
    }
    public static void test(){
        int [] arr1 = {1,4,5,7,9};
        int [] arr2 = {4,5,7,9};
        ArrayUtils.printSingleResult(new LostElement().findLostElement(arr1 , arr2));
    }
}
