package com.example.demo.leetCode.Array;

import java.util.Arrays;

public class IsAnagram {

    public boolean solutionSort(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();
        Arrays.sort(sSort);
        Arrays.sort(tSort);

        return sSort.equals(tSort);
    }

    public boolean solutionHash(String s, String t){
        
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int val : count) {
            if (val != 0){
                return false;
            }
        }

        return true;
    }
}
