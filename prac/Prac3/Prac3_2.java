package Prac3;

import java.util.Scanner;

class Person{
    String name ;
    String code ;

    public Person(String name, String code){
        this.name = name ;
        this.code = code ;
    }

}


class Account extends Person{
    double pay;

    public Account(String name, String code, double pay){
        super(name, code);
        this.pay = pay ;
    }
}


interface admin{
    public static final String experience = "5 years";
    
}

class Master extends Account implements admin{
    
    public Master(String name, String code, double pay, String exp) {
        super(name, code, pay);
        
      
    }

    public void display(){
        System.out.println("\nMaster name : " + name);
        System.out.println("Master code : " + code);
        System.out.println("Master pay : " + pay);
        System.out.println("Master expirence : " + experience);
    }

    public void update(Scanner sc){
        System.out.print("\nEnter Master name : ");
        name = sc.nextLine();
        System.out.print("Enter Master code : ");
        code = sc.nextLine();
        System.out.print("Enter Master pay : ");
        pay = sc.nextDouble();
    }


}
public class Prac3_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Master m = new Master("jhon", "java", 500,"4 years"); 

        m.display();
        m.update(sc);
        m.display();


    }
    
}
