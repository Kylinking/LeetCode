class Solution {
    public int singleNumber(int[] nums) {
        int count=nums[0];
    for(int j=0;j<nums.length;j++){
        int inl=nums[j];
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(inl==nums[i]){
               a++;
            }
        }
        if(a==1){
                count=nums[j];
            }
    }
    return count;
   
    }
}