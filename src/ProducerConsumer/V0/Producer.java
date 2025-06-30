package ProducerConsumer.V0;

public class Producer implements Runnable{

    private Store store;

    Producer(Store store){
        this.store = store;
    }

    @Override
    public void run() {
        while (true){
            synchronized (this.store){
                if(this.store.getItem().size() < this.store.getMaxSize()){
                    this.store.addItem(new Object());
                }
            }
        }
    }
}
