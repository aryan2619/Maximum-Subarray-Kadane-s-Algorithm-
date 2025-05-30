Leetcode's Maximum SubArray Problem solved in an optimized approach (Time Complexity: O(N))
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0],curSum=nums[0];
        for(int i=1;i<nums.length;i++){
            curSum=Math.max(nums[i],curSum+nums[i]);
            maxSum=Math.max(maxSum,curSum);
        }
        return maxSum;
    }
    }
