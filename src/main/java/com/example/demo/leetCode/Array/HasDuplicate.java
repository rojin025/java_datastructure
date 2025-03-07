package com.example.demo.leetCode.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HasDuplicate {

    // sorting
    public boolean solution(int[] nums){
        Arrays.sort(nums);

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]){
                return true;
            }
        }

        return false;
    }

    public boolean solution2(int[] nums){
        Set<Integer> seen = new HashSet<>();

        for(int num: nums){
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }

        return false;
    }
}
