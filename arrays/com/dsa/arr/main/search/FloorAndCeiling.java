package com.dsa.arr.main.search;

public class FloorAndCeiling {
    public int ceiling(int [] arr , int low , int high , int X){
        if(low <= high){
            int mid = (low+high)/2;
            if(mid < arr.length - 1 && arr[mid] == X && arr[mid+1] > X)
                return arr[mid+1] ;
            else if(arr[mid] < X || (mid < high && arr[mid] == X && arr[mid+1] == X))
                return ceiling(arr , mid+1 , high , X);
            else if(arr[mid] > X)
                return ceiling(arr , low , mid -1 , X);
        }
        return -1;
    }
    public int floor(int [] arr , int low , int high , int X){
        if(low <= high){
            int mid = (low+high)/2;
            if(mid > 0 && arr[mid] == X && arr[mid-1] < X)
                return arr[mid-1] ;
            else if(arr[mid] > X || (mid > low && arr[mid] == X && arr[mid-1] == X))
                return floor(arr , low , mid-1 , X);
            else if(arr[mid] < X)
                return floor(arr , mid+1 , high , X);
        }
        return -1;
    }
    public static void test(){
        int [] arr = {1,2,8,10,10,12,19};
        int X = 10;
        FloorAndCeiling obj = new FloorAndCeiling();
        System.out.println("Floor(X) = "+obj.floor(arr , 0 , arr.length -1 , X));
        System.out.println("Ceiling(X) = "+obj.ceiling(arr , 0 , arr.length -1 , X));
    }
}
