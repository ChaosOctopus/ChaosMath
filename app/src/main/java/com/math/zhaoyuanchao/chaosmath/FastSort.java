package com.math.zhaoyuanchao.chaosmath;

/**
 * Created by zhaoyuanchao on 2020/3/27.
 */
public class FastSort {
    void sort(int[] nums,int lo,int hi){
        if (lo >= hi) return;
        int p = partition(nums,lo,hi);
        sort(nums,lo,p-1);
        sort(nums,p+1,hi);
    }

    private int partition(int[] nums, int lo, int hi) {
        swap(nums,randRange(lo,hi),hi);
        int i,j;
        for (i = lo,j = lo;j < hi;j++){
            if (nums[j] <= nums[hi]){
                swap(nums,i++,j);
            }
        }
        swap(nums,i,j);
        return i;
    }

    private void swap(int[] nums, int randRange, int hi) {

    }

    private int randRange(int lo, int hi) {
        return 0;
    }
}
