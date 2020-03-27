package com.math.zhaoyuanchao.chaosmath;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaoyuanchao on 2019-11-28.
 */
public class LeetCodeDeleteSamllInNum {
    public int removeDuplicates(int[] nums){
        if (nums.length == 0) return 0;
        int i=0;
        for (int j = 1;j < nums.length;j++){
            if (nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
