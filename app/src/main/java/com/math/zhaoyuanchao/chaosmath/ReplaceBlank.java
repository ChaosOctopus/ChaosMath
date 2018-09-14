package com.math.zhaoyuanchao.chaosmath;

/**
 * Created by zhaoyuanchao on 2018/9/14.
 * 把字符串中的每个空格替换成"%20"，例如“We are happy.”，则输出“We%20are%20happy.”。
 */

public class ReplaceBlank {
    private char[] string;
    private int usedlength;

    public ReplaceBlank(char[] string, int usedlength) {
        this.string = string;
        this.usedlength = usedlength;
        replaceBlank(string,usedlength);
    }

    public static int replaceBlank(char[] string, int usedlength){
        if (string == null || string.length < usedlength){
            return -1;
        }
        int whiteCount = 0;

        for (int i = 0; i < usedlength; i++){
            if (' ' == string[i]){
                whiteCount++;
            }
        }

        int targetLength = whiteCount * 2 + usedlength;
        int tmp = targetLength;
        if (targetLength > string.length){
            return  -1;
        }

        if (whiteCount == 0){
            return usedlength;
        }

        usedlength--;
        targetLength--;

        while (usedlength >= 0 && usedlength < targetLength){
            if (string[usedlength] == ' '){
                string[targetLength--] = '0';
                string[targetLength--] = '2';
                string[targetLength--] = '%';
            }else{
                string[targetLength--] = string[usedlength];
            }
            usedlength--;
        }
        return tmp;
    }
}
