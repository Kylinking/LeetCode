class Solution {
    public int tribonacci(int n) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
   for(int i=0;i<=n;i++){
       if(i<=3){
            arr.add(tt(i));
       }else{
           arr.add(arr.get(i-1)+arr.get(i-2)+arr.get(i-3));
       }
   } 
    return arr.get(n);
    }
    public int tt(int n){
        if(n==0){
            return 0;
        }else if(n==1||n==2){
            return n=1;
        }
        return tribonacci(n-3)+tribonacci(n-2)+tribonacci(n-1);
    }

}