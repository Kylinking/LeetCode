class Solution {
    public int romanToInt(String s) {
int a=0;
for(int z=0;z<s.length();z++){
    switch(s.charAt(z)){
        case 'I':a+=1;break;
        case 'V':a+=5;break;
        case 'X':a+=10;break;
        case 'L':a+=50;break;
        case 'C':a+=100;break;
        case 'D':a+=500;break;
        case 'M':a+=1000;break;
        default:System.out.println("错误");break;
    }
    if(z!=0){
        if(((s.charAt(z)=='V')||(s.charAt(z)=='X'))&&(s.charAt(z-1)=='I'))
        a=a-1*2;
        if(((s.charAt(z)=='L')||(s.charAt(z)=='C'))&&(s.charAt(z-1)=='X'))
        a=a-10*2;
       if(((s.charAt(z)=='D')||(s.charAt(z)=='M'))&&(s.charAt(z-1)=='C'))
        a=a-100*2; 
    }
}
return a;
    }
}