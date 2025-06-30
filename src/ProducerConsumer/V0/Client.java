package ProducerConsumer.V0;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(5);

        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 8; i++) {
            Producer producer = new Producer(store);
            executorService.execute(producer);
        }

        for (int i = 0; i < 6; i++) {
            Consumer consumer = new Consumer(store);
            executorService.execute(consumer);
        }
    }
}

/**
 * Only one worker will enter the store how to over come that
 * production and consumtion wont happen at a same time
 * its not efficient
 *synchronised block or method doesnt do this
 *
 * Max size is 5 inside store so 5 thread should be working not more then 5
 * and a relation producer should singal consumer production is done try to cosnume and vice versa
 */