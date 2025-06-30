package Synchronised;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtraction implements Callable<Void> {
    private Value value;
    private Lock lock;

    Subtraction(Value value,Lock lock){
        this.value = value;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {

        for (int i = 1; i < 100; i++) {
//            lock.lock();
//            synchronized (value){
//                this.value.x -= i;
//            }
//            lock.unlock();
            this.value.decrement(i);
        }
        return null;
    }
}
