package com.company;


import com.company.*;
import java.math.BigDecimal;
import java.util.*;

/*
import com.company.BubbleSort;
import com.company.SelectionSort;
import com.company.QuickSort;
import com.company.heapSort;
import com.company.CountSort;
import com.company.BucketSort;
import com.company.Qlist.MeasureCircle;
import com.company.Qlist.GreatestCommon;
*/

import com.company.Qlist.isPowerOfV2;
import com.company.findNearestNumber;


public class Main {
    public static void main(String[] args){
        int [][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int a = 19;
        System.out.println(FindNumIn2DArray.findNumberIn2DArray(matrix,a));
//       List<Integer> amountList = DivideRedPackage.divideRedPackage(1000,3);
//       for (Integer amount: amountList){
//           System.out.println("get amt: "+ new BigDecimal(amount).divide(new BigDecimal(100)));
//       }

//        MyLrU.LRUCache lruCache = new MyLrU.LRUCache(5);
//        MyLrU.lruCache.put("001", "用户1信息");
//        MyLrU.lruCache.put("002", "用户2信息");
//        System.out.println(lruCache.get("006"));

        //System.out.println(BigNumberSum.bigNumberSum("426709752318", "95481253129"));

        //System.out.println(RemoveKDigits.removeKDigits("1293702",3));

        //int[] arr = new int[]{2,9,4,5,6,7,8,1};
        // heapSort.heapSort(arr);
        // QuickSort.sort(arr, 0, arr.length-1);
        // SelectionSort.sort(array);
        // Bubblesort.sort(array);
        // int[] sortedArray = CountSort.countSort(arr); // not good for big diff max-min or not whole num
//        double[] array = new double[] {4.12,6.421,0.0023,3.0,2.123,8.122,4.12, 10.09};
//        double[] sortedArray = BucketSort.bucketSort(array);
//        System.out.println(Arrays.toString(array));

//        System.out.println(getGreatestCommonDivisor(27,14));

       // System.out.println(isPowerOfV2.isPowerOfV2(4));


            int[] numbers = {1,2,3,4,5};
            //打印12345之后的10个全排列整数
            for(int i=0; i<10;i++){
                numbers = findNearestNumber.findNearestNumber(numbers);
                findNearestNumber.outputNumbers(numbers);

            }
        }

        }

//
//class Hello {
//    public static void main(String[] args) {
//        System.out.println("I am the best!");
//    }
//}
