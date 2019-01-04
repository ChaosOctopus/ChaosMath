package com.math.zhaoyuanchao.chaosmath;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 */
public class OnlyOneTimesNum {
    private int[] nums = {2,2,1,4,1,4,5,5,8};

    public OnlyOneTimesNum() {

    }

    public int getNum(){
        for (int i=1; i<nums.length;i++){
            nums[0]^=nums[i];
        }
        return nums[0];
    }
}
