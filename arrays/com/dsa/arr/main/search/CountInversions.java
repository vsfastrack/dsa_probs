package com.dsa.arr.main.search;

import com.dsa.arr.main.util.ArrayUtils;

public class CountInversions {

    public int findInversions(int [] arr){
        int length = arr.length;
        if(length < 3)
            return -1;
        int left = 0 ,mid=1, right = 2 , count = 0 ;
        while(right < length){
            if(arr[left] > arr[mid] && arr[mid] > arr[right])
                count++;
            if(right < length-1){
                if(arr[right] > arr[right+1]){
                    left++;mid++;right++;
                }else{
                    left += 3;
                    mid += 3;
                    right += 3;
                }
            }
        }
        return count;
    }
    public static void test(){
        int [] arr1 = {1,4,5,7,9};
        int [] arr2 = {4,5,7,9};
        ArrayUtils.printSingleResult(new LostElement().findLostElement(arr1 , arr2));
    }
}
