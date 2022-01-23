class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==1&&m==0){
            nums1[0]=nums2[0];
        }
            for(int i=m,j=0;j<n;i++,j++){
                nums1[i]=nums2[j];
            }
    Arrays.sort(nums1);
    }
}