package com.company;
// m = max - min
// t(O) = O(n+m)
// s = O(m)
// yes steady sort
/// not good for big diff max-min or not whole num
//这段代码在开头有一个步骤，就是求数列的最大整数值 max。后面创建的统计数组 countArray，长度是 max + 1，以此来保证数组的最后一个下标是 max。
//优化版本的计数排序属于稳定排序

public class CountSort {
    public static int[] countSort(int[] array) {
        //1.得到数列的最大值和最小值，并算出差值d
        int max = array[0];
        int min = array[0];
        for(int i=1; i<array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
            if(array[i] < min) {
                min = array[i];
            }
        }
        int d = max - min;
        //2.创建统计数组并统计对应元素的个数
        int[] countArray = new int[d+1];
        for(int i=0; i<array.length; i++) {
            countArray[array[i]-min]++;
        }

        //3.统计数组做变形，后面的元素等于前面的元素之和
        for(int i=1;i<countArray.length;i++) {

            countArray[i] += countArray[i-1];
        }
        //4.倒序遍历原始数列，从统计数组找到正确位置，输出到结果数组
        int[] sortedArray = new int[array.length];
        for(int i=array.length-1;i>=0;i--) {
            sortedArray[countArray[array[i]-min]-1]=array[i];
            countArray[array[i]-min]--;
        }
        return sortedArray;
    }

}
