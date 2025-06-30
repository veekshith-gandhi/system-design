package ProducerConsumer.V1;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{

    private Store store;
    private Semaphore producerSemaphore,consumerSemaphore;

    Consumer(Store store,Semaphore producerSemaphore,Semaphore consumerSemaphore){
        this.store = store;
        this.consumerSemaphore = consumerSemaphore;
        this.producerSemaphore = producerSemaphore;
    }

    @Override
    public void run() {
        while (true){
            try {
                consumerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.store.removeItem();
            producerSemaphore.release();
        }
    }
}
