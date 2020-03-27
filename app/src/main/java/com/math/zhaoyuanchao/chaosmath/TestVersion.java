package com.math.zhaoyuanchao.chaosmath;

import java.nio.ByteBuffer;

/**
 * Created by zhaoyuanchao on 2020/3/2.
 */
public class TestVersion {
    public static void f(){
        String[] a = new String[2];
        Object[] b = a;
        a[0] = "1111";
        b[1] = 111;

        ByteBuffer allocate = ByteBuffer.allocate(1024);
    }
}
