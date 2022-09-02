class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
       int n=s.length();
        char[] c=s.toCharArray();
        boolean[] dp=new boolean[n];
        dp[0]= c[0]=='0';
        int reachable=0;
        for(int i=1;i<n;i++)
        {
            if(i>=minJump)
            {
                reachable+=dp[i-minJump]?1:0;
            }
            if(i>maxJump)
            {
                reachable-=dp[i-maxJump-1]?1:0;
            }
            dp[i]=reachable>0 && c[i]=='0';
        }
        return dp[n-1];
    }
}