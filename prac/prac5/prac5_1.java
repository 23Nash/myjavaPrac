package prac5;

import java.util.*;

class anagram{

    static Map<String , List<String>> anag = new HashMap<>(); 

    public static void sortAnagram(String[] words) {

        for (String word : words) {

            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);

            if(anag.containsKey(sorted)){
                
                List<String> t = anag.get(sorted);
                t.add(word);
                anag.put(sorted, t);

            }else{

                anag.put(sorted, new ArrayList<>());

                List<String> t = new ArrayList<>();
                t.add(word);
                anag.put(sorted, t);

            }
        }
        System.out.println(anag.values());
    }
}

public class prac5_1 {

    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat",};
        anagram.sortAnagram(words);
    }
}