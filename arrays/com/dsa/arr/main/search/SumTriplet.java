package com.dsa.arr.main.search;

import com.dsa.arr.main.util.ArrayUtils;

import java.util.Arrays;

public class SumTriplet {

    public int lesserSumTriplet(int [] arr , int sum){
        int length = arr.length;
        if(length < 3)
            return 0;
        Arrays.sort(arr);
        int count = 0;
        for(int first = 0 ; first < length - 2 ; first++){
                int target = sum - arr[first]  ,start = first+1 , end = length-1;
                while(start < end && (arr[start] + arr[end] >= target))
                    end--;
                if(start < end)
                    count += end - (start-1);
        }
        return count;
    }
    public static void test(){
        int [] arr = {5,1,3,4,7};
        int sum = 12;
        ArrayUtils.printSingleResult(new SumTriplet().lesserSumTriplet(arr , sum));
    }
}
