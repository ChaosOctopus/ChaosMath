package com.math.zhaoyuanchao.chaosmath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] ints  = {4,2,6,1,3,4,10};
        BubbleChangfe bubbleChangfe = new BubbleChangfe();
        bubbleChangfe.sort(ints);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
