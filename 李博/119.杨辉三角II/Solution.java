class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> arr=new ArrayList<List<Integer>>();
        for(int i=0;i<=rowIndex;i++){
            ArrayList<Integer> arr1=new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    arr1.add(1);
                }else{
                    arr1.add(arr.get(i-1).get(j-1)+arr.get(i-1).get(j));
                }
            }
            arr.add(arr1);
        }
        return arr.get(rowIndex);
        
        
    }
}