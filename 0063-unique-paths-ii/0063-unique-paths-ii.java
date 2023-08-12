class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
         int[][] nums=new int[m][n];
        boolean ok=true;
        for(int l=n-1;l>=0;l--)
        {
            if(obstacleGrid[m-1][l]==1)ok=false;
          if(ok){
              
          
            nums[m-1][l]=1;
          }else{
              
          
               nums[m-1][l]=0;  
          }  
        }
      for(int i=m-2;i>=0;i--)
      {
          for(int j=n-1;j>=0;j--)
          {
              int x=0;
              int y=0;
              if(obstacleGrid[i][j]==0){
                  
              if(i+1>=m){
                  x=0;
              }else{
                  x=nums[i+1][j];
              }
              if(j+1>=n){
                   y=0;
              }else{
                  y=nums[i][j+1];
              }
              nums[i][j]=x+y;
              }else{
                  nums[i][j]=0;
              }
          }
      }
        return nums[0][0];
    }
}