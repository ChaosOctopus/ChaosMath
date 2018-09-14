package com.math.zhaoyuanchao.chaosmath;

/**
 * Created by zhaoyuanchao on 2018/9/14.
 * 写一个函数，输入n，求斐波那契数列的第n项值。
 * 斐波那契数列的定义如下：
 * F0 = 0;
 * F1 = 1;
 * Fn = F(n-1) + F(n-2)
 */

public class Fibonacci {
    public static long fibonacci(int n) {

        // 当输入非正整数的时候返回0
        if (n <= 0) {
            return 0;
        }

        // 输入1或者2的时候返回1
        if (n == 1 || n == 2) {
            return 1;
        }

        // 第n-2个的Fibonacci数的值
        long prePre = 1;
        // 第n-1个的Fibonacci数的值
        long pre = 1;
        // 第n个的Fibonacci数的值
        long current = 2;

        // 求解第n个的Fibonacci数的值
        for (int i = 3; i <= n ; i++) {
            // 求第i个的Fibonacci数的值
            current = prePre + pre;
            // 更新记录的结果，prePre原先记录第i-2个Fibonacci数的值
            // 现在记录第i-1个Fibonacci数的值
            prePre = pre;
            // 更新记录的结果，pre原先记录第i-1个Fibonacci数的值
            // 现在记录第i个Fibonacci数的值
            pre = current;
        }

        // 返回所求的结果
        return current;
    }
}
