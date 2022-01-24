class Solution {
    public boolean isPowerOfTwo(int n) {
        int d=2,m=0;
        boolean falg=false;
        while(m<(int)Math.sqrt(n)){
            if(d*2==n||n==1||n==2){
                falg=true;
                break;
            }else {
                d*=2;
                m++;
            }
        }
        return falg;
    }
    
}