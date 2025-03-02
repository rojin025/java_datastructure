package com.example.demo.dataStructure;

import java.util.HashMap;

public class HashMapExample {

    // static HashMap<String, Integer> basket = new HashMap<>();

    public static void main (String[] args){
        HashMap<String, Integer> basket = new HashMap<>();

        basket.put("apple", 1);
        System.out.println(basket.get("apple"));
        
        basket.put("apple", 3);
        System.out.println(basket.get("apple"));
        
        basket.put("orange", 1);
        System.out.println(basket.containsKey("orange"));
        
        basket.merge("apple", 1, Integer::sum);
        System.out.println(basket.get("apple"));
        
        basket.merge("orange",2,Integer::sum);
        System.out.println(basket.get("orange"));
    }

}
