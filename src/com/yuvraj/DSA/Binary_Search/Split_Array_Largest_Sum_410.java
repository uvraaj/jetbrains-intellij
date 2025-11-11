package com.yuvraj.DSA.Binary_Search;

public class Split_Array_Largest_Sum_410 {
    public static void main(String[] args) {
        int nums[] = {7,2,5,10,8};
        int k = 2;

        System.out.println("Minimized largest sum is: " + splitArray(nums, k));
    }
    public static int splitArray(int nums[], int k) {
        int minVal = Integer.MIN_VALUE;
        int maxValue = 0;

        for (int n : nums) {
            minVal = Math.max(minVal, n);
            maxValue += n;
        }

        while (minVal < maxValue) {
            int midVal = minVal + (maxValue - minVal) / 2;

            if(canSplit(midVal,nums,k)) {
                maxValue = midVal;
            } else {
                minVal = midVal + 1;
            }
        }
        return minVal;
    }
    private static boolean canSplit(int upperBoundSubarraySum, int[] nums, int k) {
        int curSubarraySum = 0;
        int cntSubarray = 1;

        for (int n : nums) {
            curSubarraySum += n;

            if(curSubarraySum > upperBoundSubarraySum) {
                cntSubarray++;
                curSubarraySum = n;

                if(cntSubarray > k) {
                    return false;
                }
            }
        }
        return true;
    }
}
