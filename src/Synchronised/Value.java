package Synchronised;

public class Value {
    public int x = 0;

    public synchronized void increment(int i){
        this.x += i;
    }

    public synchronized void decrement(int i){
        this.x -= i;
    }
}
