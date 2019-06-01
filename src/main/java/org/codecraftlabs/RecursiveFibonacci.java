package org.codecraftlabs;

public class RecursiveFibonacci {
    public long fibonacci(int n) {
        return fibonacciWorker(n);
    }

    private long fibonacciWorker(long number) {
        if(number <= 0) {
            return 0;
        } else if(number == 1) {
            return 1;
        } else {
            return fibonacciWorker(number - 1) + fibonacciWorker(number - 2);
        }
    }
}
