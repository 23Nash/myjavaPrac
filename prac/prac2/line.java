package prac2;


class line {
    point p1,p2;
    line(point p1, point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    

    public double length() { 
        double p = Math.pow((p2.x-p1.x),2);
        double q = Math.pow((p2.y-p1.y),2);
        double d = Math.sqrt(p+q);
        System.out.println("Length of line: " + d);
        return d;
    }

    public static void main(String[] args){
        point a = new point();
        point b = new point(0,5);
        line l = new line(a,b);
        double length = l.length();
        System.out.println("Length of line: " + length);
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
  
