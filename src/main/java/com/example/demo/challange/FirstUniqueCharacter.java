package com.example.demo.challange;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    // str = "apple"
    public char findFirstUnique(String str){
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        // loop to stor all char
        for (char c: str.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c , 0) + 1);
        }


        System.out.println("==========================");
        System.out.println(charCount.entrySet());
        // loop to find first char with 1 value and return
        for (Map.Entry<Character, Integer> entry: charCount.entrySet()){
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '\0';
    }

}
