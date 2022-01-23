class Solution {
    public int maxSubArray(int[] nums) {
       int anlmax=0;
       int max=nums[0];
       for(int i=0;i<nums.length;i++){
           anlmax=Math.max(anlmax+nums[i],nums[i]);
            max=Math.max(max,anlmax);
       }
        
        return max;
    }
}