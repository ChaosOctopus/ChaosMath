package com.math.zhaoyuanchao.chaosmath;

import java.util.Arrays;

/**
 * Created by zhaoyuanchao on 2019-11-28.
 */
public class BubbleSort {
    public int[] sort(int[] aourceArray) throws Exception {
        int[] arr = Arrays.copyOf(aourceArray, aourceArray.length);
        for(int i=1;i<arr.length;i++){
            boolean flag = true;
            for (int j = 0; j<arr.length-i;j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if (flag){
                break;
            }
        }
        return arr;

    }
}
