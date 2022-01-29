class Solution {
    public int[] countBits(int n) {
        int [] arr=new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=countAbs(i);
        }
        return arr;
    }
    public int countAbs(int x){
        int count=0;
        while(x>0){
            x&=(x-1);
            count++;
        }
        return count;
    }
}