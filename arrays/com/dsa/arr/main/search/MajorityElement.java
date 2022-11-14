package com.dsa.arr.main.search;

import com.dsa.arr.main.util.ArrayUtils;

public class MajorityElement {
    public boolean isMajorityElement(int [] arr , int X){
        int firstOccurnece = ArrayUtils.findFirstOccurence(arr , 0 , arr.length -1 , X);
        int lastOccurnece = ArrayUtils.findLastOccurence(arr , 0 , arr.length -1 , X);
        if(firstOccurnece == -1 || lastOccurnece == -1)
            return false;
        return (lastOccurnece - firstOccurnece + 1) > (arr.length / 2);
    }
    public static void test(){
        int [] arr = {1,2,3,3,3,3,10};
        int X = 3;
        System.out.println("isMajorityElement("+X+") = "+new MajorityElement()
                .isMajorityElement(arr , X));
    }
}
