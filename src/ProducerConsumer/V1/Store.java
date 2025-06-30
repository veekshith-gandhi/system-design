package ProducerConsumer.V1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    private int maxSize= 0;
    private ConcurrentLinkedDeque<Object> item;

    Store(int maxSize){
        this.maxSize = maxSize;
        this.item = new ConcurrentLinkedDeque<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public ConcurrentLinkedDeque<Object> getItem() {
        return item;
    }

    public void addItem(Object item){
        System.out.println("Item is produced " + this.item.size());
        this.item.add(item);
    }

    public void removeItem(){
        System.out.println("Item is consumed " + this.item.size());
        this.item.remove();
    }
}
