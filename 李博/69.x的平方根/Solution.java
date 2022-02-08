class Solution {
    public int mySqrt(int x) {
        int left=1,reght=x;
        while(left<=reght){
            int min=left+(reght-left)/2;
            if(min<x/min){
                 left=min+1;
            }else if(min>x/min){
                reght=min-1;
            }else if(min==x/min){
                return min;
            }

        }
        return reght;
    }
}