package com.math.zhaoyuanchao.chaosmath;

/**
 * Created by zhaoyuanchao on 2020/3/27.
 */
public class InsertSort {
    void sort(int[] nums){
        for(int i = 1,j,current; i < nums.length;i++){
            current = nums[i];
            for (j = i-1;j>= 0 && nums[j] > current;j--){
                nums[j+1] = nums[j];
            }

            nums[j+1] = current;
        }
    }
}
