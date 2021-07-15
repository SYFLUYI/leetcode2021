package com.company.Qlist;
import java.util.*;

class MiniStack {
    //面试的时候被问到不能用额外空间，就去网上搜了下不用额外空间的做法。思路是栈里保存差值。
    //时间复杂度：O(1)
    //空间复杂度：O(n)O(n)
    /** initialize your data structure here. */
    Deque<Integer> xStack;
    Deque<Integer> minStack;

    public void MinStack() {
        xStack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        xStack.push(val);
        minStack.push(Math.min(minStack.peek(), val));

    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        return xStack.peek();

    }

    public int getMin() {
        return minStack.peek();

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */