class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        int max=0;
        for(String x:wordDict)
        {
            max=Math.max(max,x.length());
        }
        boolean[] dp=new boolean[n+1];
        dp[0]=true;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(i-j>max)continue;
                if(dp[j] && wordDict.contains(s.substring(j,i)))
                {
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n];
    }
}