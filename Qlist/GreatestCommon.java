package com.company.Qlist;
import java.util.*;

public class GreatestCommon {
    public static int getGreatestCommonDivisor(int a, int b)
    {
        if(a == b){
            return a;
        }
        if((a&1)==0 && (b&1)==0){
            return getGreatestCommonDivisor(a>>1, b>>1)<<1;
        } else if((a&1)==0 && (b&1)!=0){
            return getGreatestCommonDivisor(a>>1, b);
        } else if((a&1)!=0 && (b&1)==0){
            return getGreatestCommonDivisor(a, b>>1);
        } else {
            int big = a>b ? a:b;
            int small = a<b ? a:b;
            return getGreatestCommonDivisor(big-small, small);
        }
    }

//    public static void main(String [] args){
//
//    }
}
