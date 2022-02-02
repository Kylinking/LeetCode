class Solution {
    public String addBinary(String a, String b) {
       StringBuffer sb=new StringBuffer();
        int n=Math.max(a.length(),b.length());
        int count=0;
        for(int i=0;i<n;i++){
            count+=i<a.length()?(a.charAt(a.length()-1-i)-'0'):0;
            count+=i<b.length()?(b.charAt(b.length()-1-i)-'0'):0;
            sb.append((char)(count%2+'0'));
            count=count/2;
        }
        if(count>0){
            sb.append('1');
        }
       sb.reverse();
       return sb.toString();
    }
}