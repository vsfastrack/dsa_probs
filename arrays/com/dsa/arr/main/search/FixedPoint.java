package com.dsa.arr.main.search;

import com.dsa.arr.main.util.ArrayUtils;

public class FixedPoint {
    public int findFixedPoint(int [] arr , int low , int high){
        if(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == mid)
                return mid;
            else if(arr[mid] < mid)
                return findFixedPoint(arr , mid+1 , high);
            else
                return findFixedPoint(arr , low , mid-1);
        }
        return -1;
    }
    public static void test(){
        int [] arr = new int [] {-10 , -5 , 0 ,3, 7};
        int start = 0;
        while(start < arr.length && arr[start] < 0)
            start++;
        ArrayUtils.printSingleResult(new FixedPoint()
                .findFixedPoint(arr , start , arr.length -1));
    }
}
