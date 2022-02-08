class Solution {
    public int sumOfUnique(int[] nums) {
            int all=0;
            int count=0;
            for(int j=0;j<nums.length;j++){
                for(int i=0;i<nums.length;i++){
                if(nums[j]==nums[i]){  

                    if(j!=i){
                         count=nums[i];
                        nums[i]=0; 
                    }
            }
        }
         if(count==nums[j]){
             nums[j]=0;
         }
            }
            for(int i=0;i<nums.length;i++){
                all+=nums[i];
            }
          return all;
    }
}