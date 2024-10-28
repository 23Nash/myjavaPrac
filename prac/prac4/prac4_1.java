package prac4;

import java.util.*;

class FoodDonation{
    String food;
    int quantity;

    public FoodDonation(String f, int q){
        food = f;
        quantity = q;
    }

    public  void aadQuantity(int q){
        quantity += q;
    }

    public String getFood(){
        return food;
    }

    public int getQuantity(){
        return quantity;
    }
}

class Donation{

    List<FoodDonation> donations;

    public Donation(){
        donations = new ArrayList<FoodDonation>();
    }

    public void makeDonation(String food ,int quantity){
        for(FoodDonation obj : donations){
            if(obj.getFood().equalsIgnoreCase(food)){
                obj.aadQuantity(quantity);
                return;
            }
        }
        donations.add(new FoodDonation(food,quantity));
    }

    public void viewSummary(){
        System.out.println("Donations recived");
        for(FoodDonation obj : donations){
            System.out.println("Food: " + obj.getFood() + " Quantity: " + obj.getQuantity());
        }
        System.out.println();
    }

    public void viewTotalDonations() {
        int total = 0;
        for (FoodDonation item : donations) {
            total += item.getQuantity();
        }
        System.out.println("\nTotal Quantity of All Donations: " + total + " units\n");
    }
}

public class prac4_1 {

    public static void main(String[] args) {
        Donation donation = new Donation();

        Scanner sc = new Scanner(System.in);
        String foodName;
        int quantity;
        int choice;
        do{
            System.out.println("<--Donation Management System-->");
            System.out.println("1.  Make donation");
            System.out.println("2.  View donation summary");
            System.out.println("3.  View total domnations");
            System.out.println("4.  Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the food name: ");
                    foodName = sc.next();
                    System.out.print("Enter Quantity(units): ");
                    quantity = sc.nextInt();
                    donation.makeDonation(foodName, quantity);     
                    System.out.println("Donation made!");   
                    break;
                case 2:
                    donation.viewSummary(); 
                    break;
                case 3:
                    donation.viewTotalDonations();
                    break;
                case 4:
                    System.out.println("Close!!");
                    break;
                default:                    
                    System.out.println("Invalid choice");
                    break;
            }

       }while(choice!=4);
       sc.close();
    }
    
}
