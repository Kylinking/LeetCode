class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> arr=new ArrayList<List<Integer>>();
        int length=nums.length;
        int teg=nums[0];
        int a=0;
        for(int i=0;i<length;i++){
            if(teg==nums[i]){
                a++;
            }
        }
      if(a==length&&length>=4){
       if(nums[0]+nums[1]+nums[2]+nums[3]==target){
           List<Integer> coun=new ArrayList<Integer>();
           coun.add(nums[0]);
            coun.add(nums[1]);
            coun.add(nums[2]);
            coun.add(nums[3]);
            arr.add(coun);
            
       }   
      }else{
        
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                for(int k=j+1;k<length;k++){
                    for(int l=k+1;l<length;l++){
                        if(nums[i]+nums[j]+nums[k]+nums[l]==target){
                              List<Integer> coun=new ArrayList<Integer>();
                            coun.add(nums[i]);
                            coun.add(nums[j]);
                            coun.add(nums[k]);
                            coun.add(nums[l]);
                            Collections.sort(coun);
                            if(!arr.contains(coun)){
                                arr.add(coun);
                            }
                        }
                    }
                }
            }
        }
      }
        return arr;
    }
}