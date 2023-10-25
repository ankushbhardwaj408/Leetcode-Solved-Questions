class Solution {
    public int largestRectangleArea(int[] nums) {
        int[] next=new int[nums.length];
        int[] prev=new int[nums.length];
        Arrays.fill(next,nums.length);
        Arrays.fill(prev,-1);
        Stack<Integer> st1=new Stack<>();
        st1.push(0);
        for(int i=1;i<nums.length;i++)
        {
            if(!st1.isEmpty() && nums[st1.peek()]<=nums[i]){
                st1.push(i);
            }
                while(!st1.isEmpty() && nums[st1.peek()]>nums[i])
                {
                    next[st1.peek()]=i;
                    st1.pop();
                }
                st1.push(i);
            
        }
        Stack<Integer> st2=new Stack<>();
        st2.push(nums.length-1);
        for(int i=nums.length-2;i>=0;i--)
        {
            if(!st2.isEmpty() && nums[st2.peek()]<=nums[i]){
                st2.push(i);
            }
                while(!st2.isEmpty() && nums[st2.peek()]>nums[i])
                {
                    prev[st2.peek()]=i;
                    st2.pop();
                }
                st2.push(i);
            
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int ans=(next[i]-prev[i]-1)*nums[i];
            max=Math.max(ans,max);
            
        }
       
     return max;
    }
}