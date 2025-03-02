package com.example.demo.DataStructure;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args){
        LinkedHashMap<String, Integer> basket = new LinkedHashMap<>(10, 0.75f, true);

        basket.put("apple", 2);
        basket.put("banana", 1);
        basket.put("orange", 4);

        basket.get("apple");

        basket.forEach((key, value) -> System.out.println(key + ": " + value));


    }
}
