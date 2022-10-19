package com.dsa.arr.main.rotation;

import com.dsa.arr.main.util.ArrayUtils;

public class CyclicRotation {

    public static void rotateCycilc(int [] arr , int d){
        int length = arr.length;
        if(d < 0 || d >= length)
            return;
        ArrayUtils.reverse(arr , 0 , length - 1-d);
        ArrayUtils.reverse(arr , length -d , length-1);
        ArrayUtils.reverse(arr , 0 , length-1);
    }

    public static void test(){
        int [] arr = {1,2,3,4,5};
        rotateCycilc(arr , 1);
        ArrayUtils.printArr(arr);
    }
}
