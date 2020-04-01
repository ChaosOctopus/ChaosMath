package com.math.zhaoyuanchao.chaosmath;

/**
 * Created by zhaoyuanchao on 2020/4/1.
 * 合并K个排列链表，分治思想
 */
public class MergeKLists {
    public PrintLink.ListNode mergeKLists(PrintLink.ListNode[] lists,int low,int high){
        if (low == high) return lists[low];
        int middle = low + (high -low)/2;
        return mergeTwoLists(
                mergeKLists(lists,low,middle),
                mergeKLists(lists,middle+1,high)
        );
    }

    private PrintLink.ListNode mergeTwoLists(PrintLink.ListNode a, PrintLink.ListNode b) {
        if(a == null) return b;
        if (b == null) return a;
        if (a.val <= b.val){
            a.nxt = mergeTwoLists(a.nxt,b);
            return a;
        }
        b.nxt = mergeTwoLists(a,b.nxt);
        return b;

    }
}
