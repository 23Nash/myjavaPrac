package prac2;

import java.util.*;

public class circle {
    
    public static void translate(point p, int tx, int ty){
        p.x += tx;
        p.y += ty;
        
        System.out.println("new center of circle:");
        p.display();
    }
    
    public static void main(String[] args){
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and y coordinates of center of circle:");
        x = sc.nextInt();
        y = sc.nextInt();
        
        point p = new point(x,y);
        
        int tx,ty;
        System.out.println("Enter x and y coordinates to translate the center of circle:");
        tx = sc.nextInt();
        ty = sc.nextInt();
        
        translate(p,tx,ty);
        sc.close();
    }
    
}
