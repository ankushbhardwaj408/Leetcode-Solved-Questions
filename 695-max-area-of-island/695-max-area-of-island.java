class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] ans= new boolean[grid.length][grid[0].length];
        int max=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                int sum=0;
                if(!ans[i][j] && grid[i][j]==1)
                {
                    sum=fun(i,j,ans,grid);
                    max=Math.max(sum,max);
                }
            }
           
        }
         return max;
    }
    public int fun(int r,int c,boolean[][] ans,int[][] grid)
    {
       
        if(r>=grid.length || c>=grid[0].length || r<0 || c<0) return 0;
         if(ans[r][c]) return 0;
        if( grid[r][c]==0) return 0;
        ans[r][c]=true;
        int x=fun(r+1,c,ans,grid);
        int y=fun(r-1,c,ans,grid);
        int z=fun(r,c+1,ans,grid);
        int m=fun(r,c-1,ans,grid);
        return x+y+z+m+1;
    }
}