package com.math.zhaoyuanchao.chaosmath;

/**
 * Created by zhaoyuanchao on 2020/3/27.
 */
public class BubbleChangfe {

    void sort(int[] nums){
        boolean hasChange = true;
        for (int i = 0;i < nums.length-1 && hasChange;i++){
            hasChange = false;
            for (int j = 0;j<nums.length-1-i;j++){
                if (nums[j] > nums[j+1]){
                    swap(nums,j,j+1);
                    hasChange = true;
                }
            }
        }
    }

    private void swap(int[] nums, int j, int i) {
        int a = nums[j];
        nums[j] = nums[i];
        nums[i] = a;
    }
}
