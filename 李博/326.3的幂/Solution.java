class Solution {
    public boolean isPowerOfThree(int n) {
          int l=1;
          boolean falg=false;
          while(l<=(int)Math.sqrt(n)&&(l>0)&&(l<=19)){
              if((n==(int)Math.pow(3,l))||(n==1)){
                  falg=true;
                  break;
              }else l++;
          }
          return falg;


    }
}