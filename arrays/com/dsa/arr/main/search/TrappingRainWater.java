package com.dsa.arr.main.search;

import com.dsa.arr.main.util.ArrayUtils;

public class TrappingRainWater {

    public int findTrappedRainWater(int [] heights){
        int length = heights.length;
        if(length < 3)
            return 0;
        int [] supportFromLeft = new int[length];
        int [] supportFromRight = new int[length];
        int currentLeftSupport = heights[0] , currentRightSupport = heights[length-1] , trappedRainWater = 0;
        for(int index=1; index < length-1;index++){
            supportFromLeft[index] = currentLeftSupport;
            if(heights[index] > currentLeftSupport)
                currentLeftSupport = heights[index];
        }
        for(int index=length-1; index > 0;index--){
            supportFromRight[index] = currentRightSupport;
            if(heights[index] > currentRightSupport)
                currentRightSupport = heights[index];
        }
        for(int index = 1 ; index < length-1 ; index++){
            trappedRainWater += Math.min(supportFromLeft[index] , supportFromRight[index]) - heights[index];
        }
        return trappedRainWater;
    }
    public static void test(){
        int [] arr = {2,0,2};
        ArrayUtils.printSingleResult(new TrappingRainWater().findTrappedRainWater(arr));
    }
}
