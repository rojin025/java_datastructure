package com.example.demo.leetCode.Array;

import java.util.Arrays;

public class CircularArrayRotation {
    private int[] rotatedArray;

    public CircularArrayRotation(int[] arr, int rotations){
        int n = arr.length;
        rotatedArray = new int[n];

        // Efficient Array
        rotations %= n;

        for(int i = 0; i < n; i++){
            rotatedArray[(rotations + i) % n] = arr[i];
        }
    }

    public  int query(int index){
        System.out.println("output: "  + Arrays.toString(rotatedArray));
        return rotatedArray[index];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int rotation = 3;

        CircularArrayRotation circularArrayRotation = new CircularArrayRotation(arr, rotation);

        System.out.println(circularArrayRotation.query(0));
    }
}
