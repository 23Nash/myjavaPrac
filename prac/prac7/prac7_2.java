package prac7;

import java.util.*;

class ThreadSum extends Thread{

    private List<Integer> subList;
    private int[] result;
    private int index;

    public ThreadSum(List<Integer> subList, int[] result, int index) {
        this.subList = subList;
        this.result = result;
        this.index = index;
    }

    int sum = 0;
    @Override
    public void run() {
        for(int num : subList){
            sum += num;
        }
        result[index] = sum;
    }

}

public class prac7_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < 1000 ; i++){
            list.add(i);
        }

        int nthreads = 5;
        int subListSize = list.size() / nthreads;

        int results[] = new int[nthreads];

        ThreadSum[] ts = new ThreadSum[nthreads];
        

        for (int i = 0; i < nthreads; i++) {
            int fromIndex = i * subListSize;
            int toIndex = (i == nthreads - 1) ? list.size() : fromIndex + subListSize;
            List<Integer> subList = list.subList(fromIndex, toIndex);

            ts[i] = new ThreadSum(subList, results, i);
            ts[i].start();
        }

         for (ThreadSum t : ts) {
            try {
                t.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        int sumRes = 0;
        for (int result : results) {
            sumRes += result;
           
        }
        System.out.println("Sum of the elements in array list: "+sumRes);
    }
    
}