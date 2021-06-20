package com.company;
// t = O()
// S = O()

public class SelectionSort {
    public static void sort(int array[]){
        int tmp = 0;
        for(int i =0; i< array.length/2; i++){
            boolean isSorted = true;
            //odd run, switch form left to right
            for (int j=i; j<array.length-i-1;j++)
            {
                if (array[j] > array[j+1])
                {
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    isSorted = false;
                }
            }
            if(isSorted){
                break;
            }
            isSorted = true;
            // even run, switch from right to left
            for(int j=array.length-i-1;j>i;j--)
            {
                if (array[j]<array[j-1])
                {
                    tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                    isSorted = false;
                }
            }
            if(isSorted){
                break;
            }
        }
    }
}
