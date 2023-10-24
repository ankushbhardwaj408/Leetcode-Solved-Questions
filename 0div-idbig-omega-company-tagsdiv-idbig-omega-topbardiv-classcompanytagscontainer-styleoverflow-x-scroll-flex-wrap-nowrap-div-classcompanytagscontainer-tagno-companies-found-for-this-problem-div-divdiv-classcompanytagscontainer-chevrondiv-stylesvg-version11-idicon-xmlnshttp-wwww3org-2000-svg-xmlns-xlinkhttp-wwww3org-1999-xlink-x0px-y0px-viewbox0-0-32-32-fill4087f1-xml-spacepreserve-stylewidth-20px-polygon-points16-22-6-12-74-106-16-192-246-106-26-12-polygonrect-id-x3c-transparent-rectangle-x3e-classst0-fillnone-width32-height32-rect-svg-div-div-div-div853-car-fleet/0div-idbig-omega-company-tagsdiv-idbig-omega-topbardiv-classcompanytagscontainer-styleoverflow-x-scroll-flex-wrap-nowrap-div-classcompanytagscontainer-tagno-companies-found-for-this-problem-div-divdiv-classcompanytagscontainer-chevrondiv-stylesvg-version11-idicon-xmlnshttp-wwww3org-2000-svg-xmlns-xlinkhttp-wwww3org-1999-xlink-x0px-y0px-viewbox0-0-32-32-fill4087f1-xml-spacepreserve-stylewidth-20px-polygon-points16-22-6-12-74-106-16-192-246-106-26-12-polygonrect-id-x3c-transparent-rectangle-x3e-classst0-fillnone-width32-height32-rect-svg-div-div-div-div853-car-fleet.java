class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<speed.length;i++)
        {
            map.put(position[i],speed[i]);
        }
        Stack<Integer> st=new Stack<>();
        Arrays.sort(position);
         st.push(position[speed.length-1]);
        for(int i=speed.length-2;i>=0;i--)
        {
           
         
                double time1=(double)(target-st.peek())/map.get(st.peek());
                double time2=(double)(target-position[i])/map.get(position[i]);
                if(time2>time1){
                    st.push(position[i]);
                }
           
        }
        return st.size();
    }
}