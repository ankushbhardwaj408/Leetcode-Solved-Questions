class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
      
        for(int i=m-1;i>=0;i--)
      {
          for(int j=n-1;j>=0;j--)
          {
              int x=0;
              int y=0;
              if(i+1>=m){
                  x=Integer.MAX_VALUE;
              }else{
                  x=grid[i+1][j];
              }
              if(j+1>=n){
                   y=Integer.MAX_VALUE;
              }else{
                  y=grid[i][j+1];
              }
              if(x!=Integer.MAX_VALUE || y!=Integer.MAX_VALUE){
                   grid[i][j]=grid[i][j]+Math.min(x,y);
              }
             
          }
      }
        return grid[0][0];
    }
}