package com.company;
import java.util.*;

public class MinNumber {
    public String minNumber(int[] nums){
        List<String> strList = new ArrayList<>();
        for (int num:nums){
            strList.add(String.valueOf(num));
        }
        strList.sort((a,b)->(a + b).compareTo(b + a));
        StringBuilder sb = new StringBuilder();
        for (String str : strList){
            sb.append(str);
        }
        return sb.toString();
    }
}
