package com.dsa.arr.main.search;

public class Leaders {
    public void printLeaders(int [] arr){
        int length = arr.length;
        int [] maxScannedSoFarArr = new int[length];
        int scannerindex = length -1;
        int maxScannedSorFar = Integer.MIN_VALUE;
        while(scannerindex >= 0){

            if(arr[scannerindex] > maxScannedSorFar){
                maxScannedSorFar = arr[scannerindex];
                maxScannedSoFarArr[scannerindex] = maxScannedSorFar;
            }
            scannerindex--;
        }
        scannerindex = 0;
        while(scannerindex < length){
            if(maxScannedSoFarArr[scannerindex] != 0)
                System.out.print(maxScannedSoFarArr[scannerindex] + "  ");
            scannerindex++;
        }
        System.out.println();
    }
    public static void test(){
        int [] arr={16,17,4,3,5,2};
        new Leaders().printLeaders(arr);
    }
}
