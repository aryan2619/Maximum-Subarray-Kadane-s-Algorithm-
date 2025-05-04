//Leetcode's Maximum Subarray Problem using Kadane's Algorithm (Brute Force) Time Complexity: O(n^2)
class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}
