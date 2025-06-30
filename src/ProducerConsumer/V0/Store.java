package ProducerConsumer.V0;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int maxSize= 0;
    private List<Object> item;

    Store(int maxSize){
        this.maxSize = maxSize;
        this.item = new ArrayList<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public List<Object> getItem() {
        return item;
    }

    public void addItem(Object item){
        System.out.println("Item is produced " + this.item.size());
        this.item.add(item);
    }

    public void removeItem(){
        System.out.println("Item is consumed " + this.item.size());
        this.item.remove(this.item.size()-1);
    }
}
