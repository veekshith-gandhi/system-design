package ProcessThread;

public class Client {
//    public static void main(String[] args) {
//        for (int i = 0; i < 1000; i++) {
//            Printer print1 = new Printer(i);
//            Thread thread = new Thread(print1);
//            thread.start();
//        }
//    }

    //Fixed Thread Pool : its fixed
//    public static void main(String[] args) {
//       ExecutorService service =  Executors.newFixedThreadPool(5);
//        for (int i = 0; i < 1000; i++) {
//            Printer printer = new Printer(i);
//            service.execute(printer);
//        }
//    }


    //cached Threadpool : no fixed number , create new thread if all existing thread are busy
//    public static void main(String[] args) {
//        ExecutorService ex =  Executors.newCachedThreadPool();
//
//        for(int i =0 ; i < 1000; i ++){
//            Printer printer = new Printer(i);
//            ex.execute(printer);
//        }
//    }

}
