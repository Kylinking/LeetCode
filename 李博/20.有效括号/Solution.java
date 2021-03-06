class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(')');
            }else if(s.charAt(i)=='{'){
                stack.push('}');
            }else if(s.charAt(i)=='['){
                stack.push(']');
            }
            if(s.charAt(i)==')'){
                if(stack.isEmpty()||stack.pop()!=')'){
                    return false;
                } 
                }else if(s.charAt(i)==']'){
                if(stack.isEmpty()||stack.pop()!=']'){
                    return false;
                } 
                }else if(s.charAt(i)=='}'){
                 if(stack.isEmpty()||stack.pop()!='}'){
                    return false;
                }
                }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
}
}