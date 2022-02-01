class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        int i = 0;
        if(s.length()%2 == 1 || s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']'){
            return false;
        }
        boolean check = true;
        while(i != s.length()){
            
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            else if(stack.size() > 0 && stack.peek() == '(' && s.charAt(i) == ')'){
                stack.pop();
            }
            else if(stack.size() > 0 && stack.peek() == '{' && s.charAt(i) == '}'){
                stack.pop();
            }
            else if(stack.size() > 0 && stack.peek() == '[' && s.charAt(i) == ']'){
                stack.pop();
            }else{
                check = false;
                break;
            }
            i++;
        }
        if(!check){
            return false;
        }else if (stack.size() == 0){
            return true;
        }else{
            return false;
        }
        
    }
}