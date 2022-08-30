class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(!st.isEmpty() && st.peek()==c)
            {
                st.pop();
            }else{
                st.push(c);
            }
        }
        char[] ans=new char[st.size()];
        for(int i=ans.length-1;i>=0;i--)
        {
            ans[i]=st.pop();
        }
        return new String(ans);
    }
}