package Prac1;

import java.util.*;

public class prac1_2 {
    
    public static long[] fibo(int t){
        long[] arr = new long[t];
        arr[0] = 0;
        arr[1] = 1;
        
        for(int i = 2; i < t; i++){
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        return arr;
      
   }
    
    public static void main(String[] args){
        System.out.print("enter number of Fibonacci terms:");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        long[] res = fibo(range);
        System.out.println("Displating "+range+" fibonacci terms:");
        for(int i = 0; i < range; i++) {
            System.out.println(res[i]);
           }
        sc.close();
    }
    
}
