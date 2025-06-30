package ProducerConsumer.V1;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{

    private Store store;
    private Semaphore producerSemaphore,consumerSemaphore;

    Producer(Store store , Semaphore producerSemaphore,Semaphore consumerSemaphore){
        this.store = store;
        this.consumerSemaphore = consumerSemaphore;
        this.producerSemaphore = producerSemaphore;
    }

    @Override
    public void run() {
        while (true){
            try {
                producerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.store.addItem(new Object());
            consumerSemaphore.release();
        }
    }
}
