package ProducerConsumer.V1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(5);

        Semaphore producerSemaphore = new Semaphore(5);
        Semaphore consumerSemaphore = new Semaphore(0);

        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 8; i++) {
            Producer producer = new Producer(store,producerSemaphore,consumerSemaphore);
            executorService.execute(producer);
        }

        for (int i = 0; i < 6; i++) {
            Consumer consumer = new Consumer(store,producerSemaphore,consumerSemaphore);
            executorService.execute(consumer);
        }
    }
}

/**
 *     Semaphore : lock with multiple locks it also helps you to signal
 *     List is not thread safe u need to handle internaly so use
 */