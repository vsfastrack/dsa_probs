package com.dsa.arr.main.search;

import com.dsa.arr.main.util.ArrayUtils;

public class MIssingNumber {
    public int findMissingNumber(int [] arr , int N){
        int xorN = 0 , xorNLess = 0 ;
        for(int i = 1 ; i <= N ;i++)
            xorN = xorN ^ i;
        for(int i = 0 ; i < arr.length ;i++)
            xorNLess = xorNLess ^ arr[i];
        return  xorN ^ xorNLess;
    }
    public static void test(){
        int [] arr = {1,2,4,6,3,7,8};
        int N = 8 ;
        ArrayUtils.printSingleResult(new MIssingNumber().findMissingNumber(arr , N));
    }
}
