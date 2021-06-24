package com.company;

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
