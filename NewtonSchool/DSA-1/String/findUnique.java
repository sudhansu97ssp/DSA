package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class findUnique {

    public static void printUnique(String str) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] Word = str.split("\\s+");

        for (String word : Word) {
            word = word.toLowerCase();
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else
                map.put(word, 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
                System.out.println(entry.getKey());
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printUnique(str);
    }
}
