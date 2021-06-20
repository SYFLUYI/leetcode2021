package com.company;

import java.util.*;
/*
所有的桶都保存在 ArrayList 集合中，每一个桶都被定义成一个链表（LinkedList<Double>），这样便于在尾部插入元素
Collections.sort 来为桶内部的元素进行排序。Collections.sort 底层采用的是归并排序或 Timsort，
T间复杂度为 O(nlogn) 的排序
第 1 步，求数列最大、最小值，运算量为 n。
第 2 步，创建空桶，运算量为 n。
第 3 步，把原始数列的元素分配到各个桶中，运算量为 n。
第 4 步，在每个桶内部做排序，在元素分布相对均匀的情况下，所有桶的运算量之和为 n。
第 5 步，输出排序数列，运算量为 n。

因此，桶排序的总体时间复杂度为 O(n)

至于空间复杂度就很容易得到了，同样是 O(n)
*/
public class BucketSort {
    public static double[] bucketSort(double[] array) {
        double max = array[0];
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        double d = max - min;

        //2. init bucket
        int bucketNum = array.length;
        ArrayList<LinkedList<Double>> bucketList = new ArrayList<LinkedList<Double>>(bucketNum);
        for (int i = 0; i < bucketNum; i++) {
            bucketList.add(new LinkedList<Double>());
        }
        //3. recurse through and put elements into the bucket
        for (int i = 0; i < array.length; i++) {
            int num = (int) ((array[i] - min) * (bucketNum - 1) / d);
            bucketList.get(num).add(array[i]);
        }

        //4. rank within the bucket
        for (int i = 0; i < bucketList.size(); i++) {
            // JDK 底层采用了归并排序或归并的优化版本
            Collections.sort(bucketList.get(i));
        }
        //5.输出全部元素
        double[] sortedArray = new double[array.length];
        int index = 0;
        for (LinkedList<Double> list : bucketList) {
            for (double element : list) {
                sortedArray[index] = element;
                index++;
            }
        }
        return sortedArray;
    }
}
