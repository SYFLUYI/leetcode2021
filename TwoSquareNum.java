package com.company;
/*
当 n \neq 4^k \times (8m+7)n  =4
k ×(8m+7) 时，我们需要判断到底多少个完全平方数能够表示 nn，我们知道答案只会是 1,2,31,2,3 中的一个：
答案为 1 时，则必有 n为完全平方数，这很好判断；
答案为 2 时，则有 n=a^2+b^2, 我们只需要枚举所有的 a(sqrt{n})a(1≤a≤ sqrt(n) )，判断 n-a^2 是否为完全平方数即可；
答案为 3 时，我们很难在一个优秀的时间复杂度内解决它，但我们只需要检查答案为 11 或 22 的两种情况，即可利用排除法确定答案。
时间复杂度：O(sqrt{n}) 其中 n 为给定的正整数。最坏情况下答案为 3，我们需要运行所有的判断，而判断答案是否为 1 的时间复杂度为 O(1)，判断答案是否为 4 的时间复杂度为 O(\log n)O(logn)，剩余判断为 O(\sqrt n)O(
，因此总时间复杂度为 O( log n + sqrt n)

空间复杂度：O(1)。我们只需要常数的空间保存若干变量。
 */
public class TwoSquareNum {
         public int numSquares(int n) {
            if (isPerfectSquare(n)) {
                return 1;
            }
            if (checkAnswer4(n)) {
                return 4;
            }
            for (int i = 1; i * i <= n; i++) {
                int j = n - i * i;
                if (isPerfectSquare(j)) {
                    return 2;
                }
            }
            return 3;
        }

        // 判断是否为完全平方数
        public boolean isPerfectSquare(int x) {
            int y = (int) Math.sqrt(x);
            return y * y == x;
        }

        // 判断是否能表示为 4^k*(8m+7)
        public boolean checkAnswer4(int x) {
            while (x % 4 == 0) {
                x /= 4;
            }
            return x % 8 == 7;
        }
    }
