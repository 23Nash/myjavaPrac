package prac5;

import java.util.*;

class StringCompression {

    public static String compressString(String input) {
        StringBuffer compressed = new StringBuffer();
        
        int countConsecutive = 0;

        for (int i = 0; i < input.length(); i++) {
            countConsecutive++;

            if (i + 1 >= input.length() || input.charAt(i) != input.charAt(i + 1)) {
                compressed.append(input.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0; 
            }
        }

        return compressed.length() < input.length() ? compressed.toString() : input;
    }

    
}


public class prac5_3 {

    public static void main(String[] args) {
        String input = "aaabbbbaabbbb";
        String output = StringCompression.compressString(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
    
}
