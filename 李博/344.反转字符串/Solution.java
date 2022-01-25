class Solution {
    public void reverseString(char[] s) {
        int r=s.length-1;
        int counte=(s.length)/2;
        for(int l=0;l<counte;l++,r--){
            char tem=s[l];
            s[l]=s[r];
            s[r]=tem;
        }
       System.out.print(s);
    }
}