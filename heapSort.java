package com.company;
import  java.util.Arrays;

// T = O(n)
// s =

public class heapSort {
    /**我们再来回顾一下堆排序算法的步骤。

     把无序数组构建成二叉堆。
     循环删除堆顶元素，并将该元素移到集合尾部，调整堆产生新的堆顶。
     第 1 步，把无序数组构建成二叉堆，这一步的时间复杂度是 O(n)。
     第 2 步，需要进行 n - 1 次循环。每次循环调用一次 downAdjust 方法，所以第 2 步的计算规模是 n(n−1)×log，时间复杂度为 O(n)。

     * “下沉”调整
     * @param array 待调整的堆
     * @param parentIndex 要“下沉”的父节点
     * @param length 堆的有效大小
     */
    public static void downAdjust(int[] array, int parentIndex, int length) {
        // temp保存父节点值，用于最后的赋值
        int temp = array[parentIndex];
        int childIndex = 2 * parentIndex + 1;
        while (childIndex < length) {
            // 如果有右孩子，且右孩子大于左孩子的值，则定位到右孩子
            if (childIndex + 1 < length && array[childIndex + 1] > array[childIndex]) {
                childIndex++;
            }
            // 如果父节点大于任何一个孩子的值，则直接跳出
            if (temp >= array[childIndex])
                break;
            //无须真正交换，单向赋值即可
            array[parentIndex] = array[childIndex];
            parentIndex = childIndex;
            childIndex = 2 * childIndex + 1;
        }
        array[parentIndex] = temp;
    }

    /**
     * 堆排序（升序）
     * @param array 待调整的堆
     */
    public static void heapSort(int[] array) {
        // 1.把无序数组构建成最大堆
        for (int i = (array.length-2)/2; i >= 0; i--) {
            downAdjust(array, i, array.length);
        }
        System.out.println(Arrays.toString(array));
        // 2.循环删除堆顶元素，移到集合尾部，调整堆产生新的堆顶
        for (int i = array.length - 1; i > 0; i--) {
            // 最后1个元素和第1个元素进行交换
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            // “下沉”调整最大堆
            downAdjust(array, 0, i);
        }
    }

}
