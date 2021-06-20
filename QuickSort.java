package com.company;
//快速排序的平均时间复杂度是 T = O(n log n)，但最坏情况下的时间复杂度是 O(n^2)
// S = O()
//双边循环法， 递归
public class QuickSort {
    public static void sort (int[] arr, int startIndex, int endIndex){
        // end condition: start index >= end index
        if (startIndex >= endIndex){
            return;
        }
        int pivotIndex = partition(arr, startIndex, endIndex);
        // put into 2 parts for recursion and sort
        sort(arr, startIndex, pivotIndex-1);
        sort(arr, pivotIndex+1, endIndex);
    }
    /**
     * partision to recursion on 2 sides
     * arr: to be switched
     * startIndex
     * endIndex
     */
private static  int partition(int[] arr, int startIndex, int endIndex){
    // for 1st position/random to be the bench index
    int pivot = arr[startIndex];
    int left = startIndex;
    int right = endIndex;

    while (left != right){
        while(left< right && arr[right] > pivot){
            right --;
        }
        while(left<right && arr[left] <= pivot){
            left++;
        }
        //switch left and right pointer element
        if(left<right){
            int p = arr[left];
            arr[left] = arr[right];
            arr[right] = p;
        }
    }
    // pivot and  pointer switch
    arr[startIndex] = arr[left];
    arr[left] = pivot;
    return left;
}

}
