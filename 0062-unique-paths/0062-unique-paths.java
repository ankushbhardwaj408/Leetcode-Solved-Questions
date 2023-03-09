class Solution {
    public int uniquePaths(int m, int n) {
        int[][] nums=new int[m][n];
        for(int l=0;l<n;l++)
        {
            nums[m-1][l]=1;
        }
      for(int i=m-2;i>=0;i--)
      {
          for(int j=n-1;j>=0;j--)
          {
              int x=0;
              int y=0;
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
          }
      }
        return nums[0][0];
    }
}