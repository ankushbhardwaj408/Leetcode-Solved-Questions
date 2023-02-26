class Solution {
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        int[][] ans=new int[m+1][n+1];
        ans[0][0]=0;
        for(int i=1;i<ans[0].length;i++)
        {
            ans[0][i]=ans[0][i-1]+1;
        }
        for(int j=1;j<ans.length;j++)
        {
            ans[j][0]=ans[j-1][0]+1;
        }
        for(int k=1;k<ans.length;k++)
        {
            for(int j=1;j<ans[k].length;j++)
            {
                if(word1.charAt(k-1)==word2.charAt(j-1)){
                    ans[k][j]=ans[k-1][j-1];
                }else{
                    ans[k][j]=1+Math.min(ans[k-1][j],Math.min(ans[k][j-1],ans[k-1][j-1]));
                }
            }
        }
        return ans[m][n];
    }
}