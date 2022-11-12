package com.dsa.arr.main.search;

import com.dsa.arr.main.util.ArrayUtils;

public class ArrayOp {

    public void deleteElement(int [] arr , int key){
        int length = arr.length;
        if(length == 0)
            return;
        int index = 0;
        boolean elementFound = false;
        while(index < length){
             if(arr[index] == key){
                 elementFound = true;
                 break;
             }
             index++;
        }
        while(index < length-1){
            arr[index] = arr[index+1];
            index++;
        }
        if(elementFound)
            arr[length -1] = Integer.MIN_VALUE;
    }
    public static void test(){
        int [] arr = {5,1,3,4,7};
        int key = 3;
        new ArrayOp().deleteElement(arr , key);
        ArrayUtils.printArr(arr);
    }
}
