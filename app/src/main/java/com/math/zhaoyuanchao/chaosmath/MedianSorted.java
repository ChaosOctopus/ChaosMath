package com.math.zhaoyuanchao.chaosmath;

/**
 * Created by zhaoyuanchao on 2020/4/1.
 * 寻找两个有序数组中的中位数
 */
public class MedianSorted {

    double findMedianSortedArrays(int nums1[],int nums2[]){
        int m = nums1.length;
        int n = nums2.length;
        int k = (m+n)/2;
        //奇数
        if ((m+n)%2 == 1){
            return findKth(nums1,0,m-1,nums2,0,n-1,k+1);
        }else{
            return(findKth(nums1,0,m-1,nums2,0,n-1,k)+
                    findKth(nums1,0,m-1,nums2,0,n-1,k+1))/2.0;
        }
    }

    private double findKth(int[] nums1, int i, int i1, int[] nums2, int i2, int i3, int i4) {
        int m = i1-i+1;
        int n = i3-i2+1;
        if (m>n){
            return findKth(nums2,i2,i3,nums1,i,i1,i4);
        }
        if (m == 0){
            return nums2[i2+i4-1];
        }
        return 0;
    }
}
