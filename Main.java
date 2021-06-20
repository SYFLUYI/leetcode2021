package com.company;
import java.util.Arrays;

import com.company.BabbleSort;

public class Main {


    public static void main(String[] args){
        int[] array = new int[]{2,3,4,5,6,7,8,1};
        BabbleSort.sort(array);
        System.out.println(Arrays.toString(array));
    }

}
//
//class Hello {
//    public static void main(String[] args) {
//        System.out.println("I am the best!");
//    }
//}
