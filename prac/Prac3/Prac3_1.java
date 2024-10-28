package Prac3;

import java.util.*;

class Publication {
    String title;
    float price;

    void getdata(Scanner sc) {
        System.out.print("Enter title: ");
        title = sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextFloat();
        sc.nextLine();  
    }

    void putdata() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

class Book extends Publication {
    int pages;

    void getdata(Scanner sc) {
        super.getdata(sc);
        System.out.print("Enter number of pages: ");
        pages = sc.nextInt();
        sc.nextLine();  
    }

    void putdata() {
        super.putdata();
        System.out.println("Pages: " + pages);
    }
}

class Tape extends Publication {
    float time;

    void getdata(Scanner sc) {
        super.getdata(sc);
        System.out.print("Enter playing time (minutes): ");
        time = sc.nextFloat();
        sc.nextLine(); 
    }

    void putdata() {
        super.putdata();
        System.out.println("Playing time: " + time + " minutes");
    }
}

public class Prac3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book book = new Book();
        Tape tape = new Tape();

        System.out.println("Enter details for the book:");
        book.getdata(sc);

        System.out.println("Enter details for the tape:");
        tape.getdata(sc);

        System.out.println("\nBook Details:");
        book.putdata();

        System.out.println("\nTape Details:");
        tape.putdata();
        
        sc.close();
    }
}
