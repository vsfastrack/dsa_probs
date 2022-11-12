package com.dsa.arr.main.search;

import com.dsa.arr.main.util.ArrayUtils;

import java.util.Arrays;

public class SetOp {

    public void findUnion(int [] arr1 , int [] arr2){
        int length1 = arr1.length;
        int length2 = arr2.length;
        if(length1 == 0 && length2 == 0)
            return ;
        if(length2 == 0)
            return ;
        if(length1 == 0)
            return ;
        Arrays.sort(arr2);
        for(int element:arr1){
            if(ArrayUtils.binarySearch(arr2 , element , 0,length1-1) == -1)
                System.out.print(element + "  ");
        }
        for(int element:arr2){
                System.out.print(element + "  ");
        }
        System.out.println();
    }
    public void findIntersection(int [] arr1 , int [] arr2){
        int length1 = arr1.length;
        int length2 = arr2.length;
        if(length1 == 0 || length2 == 0)
            return ;
        Arrays.sort(arr2);
        for(int element:arr1){
            if(ArrayUtils.binarySearch(arr2 , element , 0,length1-1) != -1)
                System.out.print(element + "  ");
        }
        System.out.println();
    }
    public static void test(){
        int [] arr1 = {7,1,5,2,3,6};
        int [] arr2 = {3,8,6,20,7};
        new SetOp().findUnion(arr1,arr2);
        new SetOp().findIntersection(arr1,arr2);
    }
}
