class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;
       Stack<Character> ans=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c=='(' || c=='[' || c=='{'){
                ans.push(c);
            }else if(c==')' && !ans.isEmpty() && ans.peek()=='('){
                ans.pop();
            }else if(c==']' && !ans.isEmpty() && ans.peek()=='['){
                ans.pop();
            }else if(c=='}' && !ans.isEmpty() && ans.peek()=='{'){
                ans.pop();
            }else{
                ans.push(c);
            }
        }
        return ans.isEmpty();
    }
}