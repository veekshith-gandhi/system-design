package ProducerConsumer.V0;

public class Consumer implements Runnable{

    private Store store;

    Consumer(Store store){
        this.store = store;
    }

    @Override
    public void run() {
        while (true){
            synchronized (this.store){
                if(this.store.getItem().size() > 0){
                    this.store.removeItem();
                }
            }
        }
    }
}
