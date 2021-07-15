//package com.company;
//
//import java.util.*;
//
//public class SnakeAndLadders{
//        public static void snakeAndLadder(int[][] board) {
//        Set<String> seen = new HashSet<>();
//        Deque<String> queue = new LinkedList<>();
//        int m = board.length;
//
//        seen.add((m-1) + "," + 0);
//        queue.offer((m - 1) + "," + 0);
//
//        int ans = 0;
//
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//
//            for (int i = 0; i < size; i++) {
//                String[] vector = queue.pollFirst().split(",");
//                int x = Integer.parseInt(vector[0]);
//                int y = Integer.parseInt(vector[1]);
//                // 终点判断：
//                // N 为 基数，则终点是0, N - 1
//                // N 为 偶数，则终点是0，0
//                if (m % 2 == 1) {
//                    if (x == 0 && y == m - 1) {
//                        return ans;
//                    }
//                } else {
//                    if (x == 0 && y == 0) {
//                        return ans;
//                    }
//                }
//                int val = transferLocate(new int[]{x, y}, m);
//
//                for (int j = 1; j <= 6; j++) {
//                    int tar = val + j;
//                    if (tar > m * m) {
//                        continue;
//                    }
//                    int[] tarLocation = transferNum(tar, m);
//                    if (board[tarLocation[0]][tarLocation[1]] != -1) {
//                        tar = board[tarLocation[0]][tarLocation[1]];
//                        tarLocation = transferNum(tar, m);
//                    }
//                    // 是否走过，走过就不走了
//                    if (seen.contains(tarLocation[0] + "," + tarLocation[1])) {
//                        continue;
//                    }
//                    seen.add(tarLocation[0] + "," + tarLocation[1]);
//                    queue.add(tarLocation[0] + "," + tarLocation[1]);
//                }
//
//                ans++;
//            }
//                return -1;
//        }
//
//    public int[] transferNum(int step, int m) {
//        int xReverse = (step + m - 1) / m;
//        int x = m - xReverse;
//        int y = step % m;
//        if (xReverse % 2 == 0) {
//            y = m - y;
//            if (y == m) {
//                y = 0;
//            }
//        } else {
//            y =  y - 1;
//            if (y == -1) {
//                y = m - 1;
//            }
//        }
//        return new int[]{x, y};
//    }
//
//    public int transferLocate(int[] location, int m) {
//        int step = (m - location[0] - 1) * m;
//        int y = 0;
//        if ((m - location[0]) % 2 == 0) {
//            y = m - location[1];
//        } else {
//            y = location[1] + 1;
//        }
//        return step + y;
//    }
//}
