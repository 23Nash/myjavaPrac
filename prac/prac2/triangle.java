package prac2;

import java.util.*;



public class triangle {
    
    int triangleCount;
    triangle() {
       
        triangleCount++;
    }
    public void peremeter(line l1, line l2, line l3){
        double d,d1,d2,d3;
        
        d1 = l1.length();
        d2 = l2.length();
        d3 = l3.length();
        d = d1+d2+d3;
        System.out.println("Perimeter if triangle is :"+d);
    }
    
    public static void main(String[] args){
        point p1  = new point();
        point p2  = new point(0,5);
        point p3  = new point(5,0);
        
        line l1 = new line(p1,p2);
        line l2 = new line(p2,p3);
        line l3 = new line(p1,p3);

        triangle t1 = new triangle();
        t1.peremeter(l1,l2,l3);
        System.out.println("Number of triangles created: " + t1.triangleCount);

    }
    
}


class circle {
    
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





class point {
    int x,y;
    point(){
        x = 0;
        y = 0;
    }
    
    point(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void display(){
        System.out.println("coordinates of point are x:"+x+"y:"+y);
    }
}


