package com.example.demo.leetCode.Array;

public class ArrayProblem {

    public int MaxSubArraySum(int[] nums){
        
        int maxSum = nums[0]; 
        int currentSum = nums[0];

        for( int i = 1; i < nums.length; i++){
            // track curr sum
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // track max sum
            maxSum = Math.max(maxSum, currentSum);

        }

        return maxSum;
    }

    public static void main(String[] args) {
        ArrayProblem arrayProblem = new ArrayProblem();
        
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(arrayProblem.MaxSubArraySum(nums));
    }
}
