package com.example.demo.challange;

public class CanFormPalindrome {
    // s = "abba"   - true
    // s = "abcdba" - false
    // s = "abbdba" - false

    public boolean isPalindrome(String s){
        if(s == null || s.length() < 1) return false;

        // store in arr[128] 
        int[] charCount = new int[128];

        // Loop char's in s
        for(char c: s.toCharArray()){
            charCount[c]++;
        };

        int oddCount = 0;
        // if odds are more then 1 then failed
        for(int count: charCount){
            if(count % 2 != 0){
                oddCount++;
            }
        }
        
        if( oddCount > 1){
            return false;
        }
        
        return true;
    }



}
