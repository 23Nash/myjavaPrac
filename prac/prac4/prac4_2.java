package prac4;

import java.util.*;

public class prac4_2 {

    public static double calculateDistance(double[] pointP, double[] pointQ) {
        if (pointP.length != pointQ.length) {
            throw new IllegalArgumentException("Points must have the same number of dimensions.");
        }

        double sum = 0.0;
        for (int i = 0; i < pointP.length; i++) {
            sum += Math.pow(pointQ[i] - pointP[i], 2);
        }

        return Math.sqrt(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of dimensions");
        int n = sc.nextInt();
        double[] pointP = new double[n];
        double[] pointQ = new double[n];
        System.out.println("Enter point P coordinates");
        for (int i = 0; i < n; i++) {
            pointP[i] = sc.nextDouble();
            }
        System.out.println("Enter point Q coordinates");
        for(int i = 0; i< n; i++){
            pointQ[i] = sc.nextDouble();
        }
        System.out.println("Distance between points P and Q is " + calculateDistance(pointP, pointQ));
        sc.close();
    }
}