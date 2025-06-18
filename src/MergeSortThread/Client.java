package MergeSortThread;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = List.of(8, 1 , 6 , 2 , 3 , 9 ,7 , 5);
        //check taking fixed thread it will stuck because it will be utilizing all thread and get stuck
        ExecutorService executorService = Executors.newCachedThreadPool();
        MergeSort mergeSort = new MergeSort(list,executorService);
        Future<List<Integer>> futureList = executorService.submit(mergeSort);

        List<Integer> result = futureList.get();
        System.out.println(result);
    }
}
