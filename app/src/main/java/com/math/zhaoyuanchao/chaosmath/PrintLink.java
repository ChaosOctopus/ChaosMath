package com.math.zhaoyuanchao.chaosmath;

import java.util.Stack;

/**
 * Created by zhaoyuanchao on 2018/9/14.
 * 输入个链表的头结点，从尾到头反过来打印出每个结点的值。
 */

public class PrintLink {

    public PrintLink() {
    }
    /**
     * 结点对象
     */
    public static class ListNode {
        int val; // 结点的值
        ListNode nxt; // 下一个结点
    }

    /**
     * 输入个链表的头结点，从尾到头反过来打印出每个结点的值
     * 使用栈的方式进行
     *
     * @param root 链表头结点
     */
    public static void printListInverselyUsingIteration(ListNode root) {
        Stack<ListNode> stack = new Stack<>();
        while (root != null) {
            stack.push(root);
            root = root.nxt;
        }
        ListNode tmp;
        while (!stack.isEmpty()) {
            tmp = stack.pop();
            System.out.print(tmp.val + " ");
        }
    }

    /**
     * 输入个链表的头结点，从尾到头反过来打印出每个结点的值
     * 使用递归的方式进行
     *
     * @param root 链表头结点
     */
    public static void printListInverselyUsingRecursion(ListNode root) {
        if (root != null) {
            printListInverselyUsingRecursion(root.nxt);
            System.out.print(root.val + " ");
        }
    }
}
