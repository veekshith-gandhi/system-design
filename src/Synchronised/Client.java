package Synchronised;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Value value = new Value();
        Lock lock = new ReentrantLock();

        /**
         * both tread running at the same time leads to synchronization issue when multiple thread
         * working on shared resource leading this issue by over writing the value
         * so introduce locking
         */
        Addition addition = new Addition(value,lock);
        Subtraction subtraction = new Subtraction(value,lock);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Void> addFuture = executorService.submit(addition);
        Future<Void> subtractFuture = executorService.submit(subtraction);

        addFuture.get();
        subtractFuture.get();

        /**
         * Then there is a synchronised blocks or  synchronized method which itself lock the critical task when you
         * invoke this method instead of calling external lock
         * prevent race condition
         * it takes object internaly do the locking system
         * They are thread safe
         */

        System.out.println("OUTPUT : "+ value.x);
    }
}

