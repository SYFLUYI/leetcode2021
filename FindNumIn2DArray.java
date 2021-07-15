package com.company;

public class FindNumIn2DArray {
        public static boolean findNumberIn2DArray(int[][] matrix, int target) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return false;
            }

            int M = matrix.length;
            int N = matrix[0].length;
            int i = 0;
            int j = N - 1;
            while (i < M && j >= 0) {
                int val = matrix[i][j];
                if (val == target) {
                    return true;
                } else if (val < target) {
                    i ++;
                } else {
                    j --;
                }
            }

            return false;
        }
    }


