class Solution {
    public int[] countBits(int n) {
        int[] in=new int[n+1];
        in[0]=0;
        if(n==0){
            return in;
        }else{
        for(int i=1;i<=n;i++){
            int count=0;
            String str="";
           String[] arr=null;
            str=Integer.toBinaryString(i);
            arr=str.split("");
            for(int j=0;j<arr.length;j++){
                if(arr[j].equals("1")){
                    count+=1;
                }
            }
            in[i]=count;
        }
        }
        return in;
    }
}