class Solution {
    public int searchInsert(int[] nums, int target) {
      int min=0;
      int b=0;
      int max=nums.length-1;
      while(min<=max){
          int miadst=(max-min)/2+min;
          if(target>nums[miadst]){
              min=miadst+1;

          }else if(target==nums[miadst]){
              return miadst;
              
          }else{
              max=miadst-1;
          }
      }
      for(int i=0;i<nums.length;i++){
          if(target>nums[i]){
              b++;
          }
      }
     return b;
    }
}