class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int ans=0;
        int m=text1.length();
        int n=text2.length();
       int[][] dp=new int[m][n];
         if( text1.charAt(0)==text2.charAt(0))
            {
                dp[0][0]=1;
            }
        for(int j=1;j<n;j++)
        {
            if( text1.charAt(0)==text2.charAt(j) || dp[0][j-1]==1)
            {
                dp[0][j]=1;
            }
            
        }
         for(int i=1;i<m;i++)
        {
            if( text1.charAt(i)==text2.charAt(0) || dp[i-1][0]==1)
            {
                dp[i][0]=1;
            }
            
        }
        for(int a=1;a<m;a++)
        {
            for(int b=1;b<n;b++)
            {
                if(text1.charAt(a)==text2.charAt(b))
                {
                    int x=dp[a-1][b-1];
                    dp[a][b]=x+1;
                }
                else{
                     int x=Math.max(dp[a-1][b],Math.max(dp[a][b-1],dp[a-1][b-1]));
                      dp[a][b]=x;
                }
            }
        }
        return dp[m-1][n-1];
    }
}