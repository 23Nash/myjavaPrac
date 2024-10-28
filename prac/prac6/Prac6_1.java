package prac6;

import java.util.*;

public class Prac6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Resturant mon = new Resturant(10,"Monday");
        Resturant tue = new Resturant(10,"Tuesday");
        Resturant wed = new Resturant(10,"Wednesday");
        Resturant thu = new Resturant(10,"Thursday");
        Resturant fri = new Resturant(10,"Friday");
        Resturant sat = new Resturant(10,"Saturday");
        Resturant sun = new Resturant(10,"Sunday");
        
       
        System.out.println("1. Monday");
        System.out.println("2. Tuesday");
        System.out.println("3. Wednesday");
        System.out.println("4. Thursday");
        System.out.println("5. Friday");
        System.out.println("6. Saturday");
        System.out.println("7. Sunday");

        while (true) {
            System.out.println("Choose the day :");
            int day = sc.nextInt();

            System.out.print("Enter number of reservations:");
            int res = sc.nextInt();
            
            switch (day) {
                case 1:
                    mon.makeReservation(res);
                    break;
                case  2:
                    tue.makeReservation(res);
                    break;
                case 3:
                    wed.makeReservation(res);
                    break;
                case 4:
                    thu.makeReservation(res);
                    break;
                case 5:
                    fri.makeReservation(res);
                    break;
                case 6:
                    sat.makeReservation(res);
                    break;
                case 7:
                    sun.makeReservation(res);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        
    }
}

class Resturant{
    int available = 10;
    String day;

    Resturant(int t, String d){
        available = t;
        day = d;
    }

    public void makeReservation(int r){
        try{
            if (available >= r) {
                System.out.println("Reservation confirmed!");
                available -= r;
            }else{
                throw new Overbooked("Tables not available");
            } 
        }catch(Overbooked o){
            System.out.println("Sorry, we are fully booked on "+day+".");
            o.getMessage();
        }finally{
            System.out.println("Available tables: "+available);
        }
    }

}

class Overbooked extends Exception{
    public Overbooked(String s) {
        System.err.println(s);
    }
}