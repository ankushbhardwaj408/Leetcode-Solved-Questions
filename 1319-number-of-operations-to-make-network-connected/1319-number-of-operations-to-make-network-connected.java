class Solution {

    public int makeConnected(int n, int[][] nums) {
        if(nums.length<n-1)return -1;
        List<List<Integer>> lis=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            lis.add(new ArrayList<>());
        }
         for(int i=0;i<nums.length;i++)
        {
            lis.get(nums[i][0]).add(nums[i][1]);
              lis.get(nums[i][1]).add(nums[i][0]);
        }
        boolean[] vis=new boolean[n];
        int ans=0;
        for(int i=0;i<n;i++)
        {
            if(!vis[i]){
                fun(i,lis,vis);
                ans++;
            }
        }
        return ans-1;
        
    }

    public void fun(int s, List<List<Integer>> lis, boolean[] vis) {
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        while (!q.isEmpty()) {
            int x = q.poll();
           
            for (int y : lis.get(x)) {
                if (!vis[y]) {
                    q.add(y);
                     vis[y] = true;
                }
            }
        }
    }
}
