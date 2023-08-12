class Solution {

   public int uniquePathsWithObstacles(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        int[][] dp = new int[row + 1][col + 1];

        for(int[] arr : dp) {
            Arrays.fill(arr, -1);
        } 

        return solve(grid, 0, 0, row, col, dp);
    }


    int solve(int[][] grid, int n, int m, int row, int col,int[][] dp) {

        if(n >= row || m >= col) return 0;

        if(grid[n][m] == 1) return 0;

        if(dp[n][m] != -1) return dp[n][m];

        if(n == grid.length - 1 && m == grid[0].length - 1) return 1;
return dp[n][m] = solve(grid,n + 1,m,row,col,dp) + solve(grid,n,m + 1,row,col,dp);
}
}
