class Solution {
    public int removeDuplicates(int[] nums) {
       if(nums.length==0||nums==null){
           return 0;
       }
       int a=0;
       int a1=1;
       while(a1<nums.length){
           if(nums[a]==nums[a1]){
               a1++;
            
           }else{
                nums[a+1]=nums[a1];
                a++; 
           }
       }
       return a+1;
    }
}