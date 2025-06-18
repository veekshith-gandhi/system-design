package MergeSortThread;

import ProcessThread.Printer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSort implements Callable<List<Integer>> {
    List<Integer> toBeSorted = new ArrayList<>();
    private ExecutorService executorService;

    MergeSort(List<Integer> toBeSorted, ExecutorService executorService){
        this.toBeSorted = toBeSorted;
        this.executorService = executorService;
    }
    @Override
    public List<Integer> call() throws Exception {

        if(this.toBeSorted.size() == 1){
            return this.toBeSorted;
        }

        int mid = this.toBeSorted.size() / 2;
        List<Integer> leftArray = this.toBeSorted.subList(0,mid);
        List<Integer> rightArray = this.toBeSorted.subList(mid,this.toBeSorted.size());

        MergeSort leftSortArray = new MergeSort(leftArray,this.executorService);
        MergeSort rightSortArray = new MergeSort(rightArray,this.executorService);

        //         it returns a Future
        Future<List<Integer>> leftArrayFuture = this.executorService.submit(leftSortArray);
        Future<List<Integer>> rightArrayFuture = this.executorService.submit(rightSortArray);

        //        We have to wait for both the threads to get completed
        List<Integer> sortedLeftArray = leftArrayFuture.get();
        List<Integer> sortedRightArray = rightArrayFuture.get();

        //Merge Sort

        int i= 0;
        int j = 0;
        List<Integer> sortedArray = new ArrayList<>();
        while (i < sortedLeftArray.size() && j < sortedRightArray.size()) {
            if (sortedLeftArray.get(i) <= sortedRightArray.get(j)) {
                sortedArray.add(sortedLeftArray.get(i));
                i += 1;
            } else {
                sortedArray.add(sortedRightArray.get(j));
                j += 1;
            }
        }
        while (i < sortedLeftArray.size()) {
            sortedArray.add(sortedLeftArray.get(i));
            i += 1;
        }
        while (j < sortedRightArray.size()) {
            sortedArray.add(sortedRightArray.get(j));
            j += 1;
        }
        return sortedArray;
    }
}
