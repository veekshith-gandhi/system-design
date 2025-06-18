package ProcessThread;

public class Printer implements Runnable {

    private final int printNo;

    Printer(int number){
        printNo = number;
    }
    @Override
    public void run() {
        System.out.println("Number : "+ printNo + " Thread : " + Thread.currentThread().getName());
    }
}
