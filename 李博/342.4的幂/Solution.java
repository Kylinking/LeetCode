class Solution {
    public boolean isPowerOfFour(int n) {
        int l=1;
          boolean falg=false;
          while(l<=(int)Math.sqrt(n)&&(n!=2147483647)){
              if((n==(int)Math.pow(4,l))||(n==1)){
                  falg=true;
                  break;
              }else l++;
          }
          return falg;
    }
}