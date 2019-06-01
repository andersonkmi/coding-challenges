package org.codecraftlabs;

import java.util.Hashtable;

public class RecursiveFibonacciMemoization {
    private Hashtable<Integer, Long> memo;

    public long fibonacci(int n) {
        memo = new Hashtable<>();
        return fibonacciWorker(n, memo);
    }

    private long fibonacciWorker(int number, Hashtable<Integer, Long> memo) {
        if(number <= 0) {
            return 0;
        } else if(number == 1) {
            return 1;
        } else if(!memo.containsKey(number)) {
            memo.put(number, fibonacciWorker(number - 1, memo) + fibonacciWorker(number - 2, memo));
        }
        return memo.get(number);
    }
}
