class Solution {
    public int climbStairs(int n) {
        int a1=1,a2=2;
        if(n==1||n==2){
            return n;
        }
        for(int i=3;i<=n;i++){
            int count=a1+a2;
            a1=a2;
            a2=count;
        }
        return a2;
    }
}