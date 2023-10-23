class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
      
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[temperatures.length];
        Arrays.fill(ans,0);
       st.push(0);
        for(int i=1;i<temperatures.length;i++)
        {
           
            if(!st.isEmpty() && temperatures[st.peek()]>=temperatures[i]){
                st.push(i);
                continue;
            }
            while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i])
            {
               
                int index=st.pop();
                
                ans[index]=i-index;
            }
            st.push(i);
            
        }
        return ans;
    }
}