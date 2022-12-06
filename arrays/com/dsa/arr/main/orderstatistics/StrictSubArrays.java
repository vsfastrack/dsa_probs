package com.dsa.arr.main.orderstatistics;

public class StrictSubArrays {
    public int findCountOfStrictSubArrays(int [] arr){
        int length = arr.length;
        if(length <2)
            return -1;
        int start = 0 , countOfIncreasingSubArr = 0;
        while(start < length){
            int index = start + 1;
            while(index < length && arr[index] > arr[index-1])
                index++;
            int lengthOfIncreasingSubArr = (index-start);
            if(lengthOfIncreasingSubArr != 0)
                countOfIncreasingSubArr += ((lengthOfIncreasingSubArr - 1)*
                        lengthOfIncreasingSubArr)/2;
            start = index;
        }
        return countOfIncreasingSubArr;
    }
    public static void test(){
        int [] arr={1,3,3,2,3,5};
        System.out.println(new StrictSubArrays()
                .findCountOfStrictSubArrays(arr));
    }
}
