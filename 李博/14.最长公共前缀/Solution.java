class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0){
            return "";
        }
    String fast=strs[0];
    for(int i=0;i<strs.length;i++){
       fast=longestCommonPrefix(fast,strs[i]);
       if(fast.length()==0){
           break;
       } 

    }
      return fast;
    }
  
   public String longestCommonPrefix(String nume1,String nume2){
        int b=Math.min(nume1.length(),nume2.length());
        int count=0;
        while(count<b&&nume1.charAt(count)==nume2.charAt(count)){
            count++;
        }
    return nume1.substring(0,count);
    }
}