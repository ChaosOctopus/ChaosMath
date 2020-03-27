package com.math.zhaoyuanchao.chaosmath;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zhaoyuanchao on 2019-11-29.
 * 无重复的最长字符串长度
 * simple:"abcabcaa"
 */
public class LongestSubstring {
    public int getSubstringWithout(String str){
        char[] chars = str.toCharArray();
        List<String> compare = new ArrayList<>();
        int maxLength = 0;
        int currentLength = 0;
        for(int i = 0;i < chars.length;i++){
            if (!compare.contains(String.valueOf(chars[i]))){
                compare.add(String.valueOf(chars[i]));
                currentLength = compare.size();
                if (currentLength >= maxLength){
                    maxLength = currentLength;
                }
            }else{
                //移除当前数据之前的相等数据
                int postion = compare.indexOf(String.valueOf(chars[i]));
                if (postion == 0){
                    compare.remove(postion);
                    continue;
                }

                Iterator<String> iterator = compare.iterator();
                for (int j=0;j<postion;j++){
                    String s = compare.get(j);
                    if (iterator.next().equals(s)){
                        iterator.remove();
                    }
                }
                //然后把数据加回去
                compare.add(String.valueOf(chars[i]));
                currentLength = compare.size();
                if (currentLength >= maxLength){
                    maxLength = currentLength;
                }
            }
        }

        return maxLength;
    }
}
