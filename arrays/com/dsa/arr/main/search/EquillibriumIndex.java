package com.dsa.arr.main.search;

import com.dsa.arr.main.util.ArrayUtils;

public class EquillibriumIndex {
    public int findEquillibriumIndex(int [] arr){
        int length = arr.length , sum = 0;
        int [] prevSum = new int[length];
        for(int i = 0 ; i < length ; i++){
            prevSum[i] = sum;
            sum += arr[i] ;
        }
        for(int i = 0 ; i < length ; i++){
            if(prevSum[i] == (sum -arr[i] - prevSum[i]))
                return i;
        }
        return -1;
    }
    public static void test(){
        int [] arr = {-7 , 1 ,5 , 2 , -4 , 3 , 0};
        ArrayUtils.printSingleResult(new EquillibriumIndex()
                .findEquillibriumIndex(arr));
    }
}
