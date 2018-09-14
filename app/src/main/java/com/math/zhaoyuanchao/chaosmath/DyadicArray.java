package com.math.zhaoyuanchao.chaosmath;

/**
 * Created by zhaoyuanchao on 2018/9/14.
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

public class DyadicArray {
    private int[][] maxArray;
    private int num;

    public DyadicArray(int[][] maxArray, int num) {
        this.maxArray = maxArray;
        this.num = num;
        find(maxArray,num);
    }

    public static boolean find(int[][] matrix, int number){
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1){
            return false;
        }

        int rows = matrix.length; // 数组的行数
        int cols = matrix[1].length; // 数组行的列数

        int row = 0; // 其实开始的行号
        int col = cols - 1; // 其实开始的列号

        while (row >= 0 && row < rows && col >= 0 && col < cols){
            if (matrix[row][col] == number){
                return  true;
            }else if (matrix[row][col] > number){
                col--;
            }else {
                row++;
            }
        }
        return false;
    }
}
