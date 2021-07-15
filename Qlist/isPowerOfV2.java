package com.company.Qlist;

public class isPowerOfV2 {
    public static boolean isPowerOfV2(int num) {
        int temp = 1;
        while (temp <= num) {
            if (temp == num) {
                return true;
            }
            temp = temp << 1;
        }
        System.out.println(num);
        return false;
    }

    //public static boolean isPowerOf2(int num) {
    //    return (num&num-1) == 0;
    //}
}
