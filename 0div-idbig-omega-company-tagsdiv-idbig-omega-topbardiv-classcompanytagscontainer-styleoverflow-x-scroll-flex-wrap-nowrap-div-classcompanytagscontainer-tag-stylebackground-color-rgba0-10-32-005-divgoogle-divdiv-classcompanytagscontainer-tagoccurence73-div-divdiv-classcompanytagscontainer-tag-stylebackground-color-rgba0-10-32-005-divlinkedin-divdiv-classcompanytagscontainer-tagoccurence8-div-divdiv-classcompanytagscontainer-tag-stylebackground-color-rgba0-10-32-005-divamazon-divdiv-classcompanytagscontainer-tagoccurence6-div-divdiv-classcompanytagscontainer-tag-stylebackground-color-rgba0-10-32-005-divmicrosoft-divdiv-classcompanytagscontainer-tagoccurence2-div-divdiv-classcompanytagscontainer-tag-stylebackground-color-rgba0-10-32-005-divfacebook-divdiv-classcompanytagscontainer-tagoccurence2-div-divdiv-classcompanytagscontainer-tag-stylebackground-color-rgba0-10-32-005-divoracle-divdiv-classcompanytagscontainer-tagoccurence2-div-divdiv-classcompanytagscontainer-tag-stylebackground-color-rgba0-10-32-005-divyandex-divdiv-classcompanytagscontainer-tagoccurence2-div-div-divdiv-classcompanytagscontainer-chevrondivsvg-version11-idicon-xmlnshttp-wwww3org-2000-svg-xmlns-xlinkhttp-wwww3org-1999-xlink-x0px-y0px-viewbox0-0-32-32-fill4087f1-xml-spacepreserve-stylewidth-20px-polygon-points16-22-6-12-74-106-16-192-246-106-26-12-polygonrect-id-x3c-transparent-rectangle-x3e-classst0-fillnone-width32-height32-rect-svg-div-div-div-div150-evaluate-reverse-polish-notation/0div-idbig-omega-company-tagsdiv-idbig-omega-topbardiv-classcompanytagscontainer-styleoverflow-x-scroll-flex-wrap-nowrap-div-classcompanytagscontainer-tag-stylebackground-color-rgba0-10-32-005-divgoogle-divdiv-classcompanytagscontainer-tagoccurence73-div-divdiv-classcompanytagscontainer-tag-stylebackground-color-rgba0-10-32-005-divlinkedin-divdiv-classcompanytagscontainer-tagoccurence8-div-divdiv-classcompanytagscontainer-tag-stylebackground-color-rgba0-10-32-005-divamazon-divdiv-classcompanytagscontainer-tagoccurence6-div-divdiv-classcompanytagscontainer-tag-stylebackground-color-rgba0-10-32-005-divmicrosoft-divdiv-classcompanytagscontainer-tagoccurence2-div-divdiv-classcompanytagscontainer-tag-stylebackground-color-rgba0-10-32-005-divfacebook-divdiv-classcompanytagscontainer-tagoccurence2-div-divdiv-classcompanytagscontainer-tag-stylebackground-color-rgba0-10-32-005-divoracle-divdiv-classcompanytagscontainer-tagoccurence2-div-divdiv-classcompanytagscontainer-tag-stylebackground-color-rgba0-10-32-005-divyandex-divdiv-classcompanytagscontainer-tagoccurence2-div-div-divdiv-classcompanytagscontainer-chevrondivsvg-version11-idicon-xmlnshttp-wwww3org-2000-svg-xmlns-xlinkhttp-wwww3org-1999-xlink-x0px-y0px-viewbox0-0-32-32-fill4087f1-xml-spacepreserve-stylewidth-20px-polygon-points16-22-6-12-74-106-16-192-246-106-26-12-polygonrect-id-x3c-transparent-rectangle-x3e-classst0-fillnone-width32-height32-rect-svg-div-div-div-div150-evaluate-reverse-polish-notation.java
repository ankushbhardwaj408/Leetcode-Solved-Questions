class Solution {

    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                int y=st.pop();
                int x=st.pop();
                int ans=x+y;
                st.push(ans);
            }else if (tokens[i].equals("-")) {
                int y=st.pop();
                int x=st.pop();
                int ans=x-y;
                st.push(ans);
            }else if (tokens[i].equals("*")) {
                int y=st.pop();
                int x=st.pop();
                int ans=x*y;
                st.push(ans);
            }else if (tokens[i].equals("/")) {
                int y=st.pop();
                int x=st.pop();
                int ans=x/y;
                st.push(ans);
            }else{
                int x=Integer.parseInt(tokens[i]);
                st.push(x);
            }
        }
        return st.pop();
    }
}
