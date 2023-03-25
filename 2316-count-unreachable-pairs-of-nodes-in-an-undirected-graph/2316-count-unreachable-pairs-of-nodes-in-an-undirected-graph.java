class Solution {
    public long countPairs(int n, int[][] nums) {
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
        long ans=0;
    long sum=n;
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(!vis[i]){
                vis[i]=true;
             int x=   bfs(lis,vis,i);
            
                sum=sum-x;
                ans=ans+(sum*x);
           
               
               
            }
        }
     
        return ans;
    }
    public int  bfs(List<List<Integer>> lis,boolean[] vis,int i){
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        int count=0;
        count++;
        while(!q.isEmpty()){
            int x=q.poll();
            for(int y:lis.get(x)){
                if(!vis[y]){
                    q.add(y);
                    
                    count++;
                    vis[y]=true;
                }
            }
        }
        return count;
    }
   
}