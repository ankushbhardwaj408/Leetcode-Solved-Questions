class Solution {
    private class Edge {
        int vertex, count;
        public Edge(int vertex, int count) {
            this.vertex = vertex;
            this.count = count;
        }
    }
   
    public int minReorder(int n, int[][] nums) {
        List<List<Edge>> lis=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            lis.add(new ArrayList<>());
        }
        for(int i=0;i<nums.length;i++)
        {
            lis.get(nums[i][0]).add(new Edge(nums[i][1],1));
              lis.get(nums[i][1]).add(new Edge(nums[i][0],0));
        }
        boolean[] vis=new boolean[n];
 
           
               
         return  dfs(0,vis,lis);
        
    }
    public int dfs(int i,boolean[] vis,List<List<Edge>> lis){
      int cost=0;
        vis[i]=true;
        for(Edge x:lis.get(i)){
         
           if(!vis[x.vertex]){
               cost+=x.count+ dfs(x.vertex,vis,lis);
             
           }
            
        }
       return cost;
    }
}