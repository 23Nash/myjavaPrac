package prac7;

import java.util.*;


class Producer implements Runnable{

    private final List<Integer> stock;
    private Random random = new Random();

    public Producer(List<Integer> stock){
        this.stock = stock;
    }

    @Override
    public void run() {

        try{

            while(true){
                if(stock.size()<=5){

                    int t = random.nextInt(99);
                    stock.add(t);
                    System.out.println("Produced: " + stock);
                }
               
                Thread.sleep(250);

            }
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    
}

class Consumer implements Runnable{

    private final List<Integer> stock;

    public Consumer(List<Integer> stock){
        this.stock = stock;
    }

    @Override
    public void run() {
       try{
        while(true){
            if(!stock.isEmpty()){
                int t = stock.remove(0);
                System.out.println("Consumed: " + t);
            }
           
            Thread.sleep(500);
        }

       }catch (InterruptedException e) {
        Thread.currentThread().interrupt();
    }
    }

}

public class prac7_1 {

    public static void main(String[] args) {

        List<Integer> stock = new  ArrayList<>(5);
        
        Thread producerThread = new Thread(new Producer(stock));
        Thread consumerThread = new Thread(new Consumer(stock));
        
        producerThread.start();
        consumerThread.start();
    }
    
}
