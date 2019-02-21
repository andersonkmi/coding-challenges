package org.codecraftlabs.hackerrank;

public class TransactionalStackThreadTest {
    public static void main(String[] args) {
        TransactionalStack stack = new TransactionalStack();

        Thread thr1 = new Thread(new TransactionalStackWorker(stack, 1));
        Thread thr2 = new Thread(new TransactionalStackWorker(stack, 2));
        Thread thr3 = new Thread(new TransactionalStackWorker(stack, 3));
        Thread thr4 = new Thread(new TransactionalStackWorker2(stack, 4));

        thr1.start();
        thr2.start();
        //thr3.start();
        thr4.start();

        try {
            thr1.join();
            thr2.join();
            //thr3.join();
            thr4.join();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

        System.out.println(stack.size());
        System.out.println("Done");
    }
}
