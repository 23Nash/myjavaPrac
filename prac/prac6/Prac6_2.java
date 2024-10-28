package prac6;

import java.util.*;

public class Prac6_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        try{
            if(n>=0){
                System.out.println(n+" is valid!");
            }else{
                throw new IllegalArgumentException("Negative numbers are not allowed.");
            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Code executed successfully!");
            sc.close();
        }
    }
}
