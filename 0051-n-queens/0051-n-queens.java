class Solution {
    List<List<String>> lis=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        boolean[][] nums=new boolean[n][n];
        fun(nums,0);
        return lis;
    }
    public void fun(boolean[][] nums,int r){
        if(r==nums.length){
            List<String> ans=new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            {
                String s="";
                for(int j=0;j<nums.length;j++)
                {
                    if(nums[i][j]==true){
                        s=s+"Q";
                    }else{
                        s=s+".";
                    }
                    
                }
             ans.add(s);
            }
            lis.add(ans);
            return;
        }
        
        
        for(int c=0;c<nums.length;c++)
        {
            if(isSafe(nums,r,c)){
                nums[r][c]=true;
                fun(nums,r+1);
                nums[r][c]=false;
            }
        }
        
        
    }
    private static boolean isSafe(boolean[][] board,int r,int c) {
        for(int i=0;i<r;i++)
        {
            if(board[i][c])
            {
                return false;
            }
        }
        int left=Math.min(r,c);
        for(int i=1;i<=left;i++)
        {
            if(board[r-i][c-i])
            {
                return false;

            }
        }
        int right=Math.min(r,board.length-1-c);
        for(int i=1;i<=right;i++)
        {
            if(board[r-i][c+i])
            {
                return false;

            }
        }
return true;
    }
}