package com.example.demo.DataStructure;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args){

        LinkedList<String> list= new LinkedList<>();
        list.add("First item");
        // list.add("Sec item");
        // list.add("Third item");

        System.out.println("List:" + list);

        System.out.println("Getfirst: " + list.getFirst());
        System.out.println("GetLast: " + list.getLast());

        //  System.out.println("Poll: " + list.poll());
        System.out.println("Pop: " + list.pop());
        System.out.println("Poll: " + list);
        
        // returns null if []
        System.out.println("Pop: " + list.poll()); 
    }

}
