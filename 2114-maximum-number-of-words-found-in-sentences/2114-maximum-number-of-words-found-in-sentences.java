class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++)
        {
            int n=sentences[i].length();
           int ans=0;
            for(int j=0;j<n;j++)
            {
               if(sentences[i].charAt(j)==' ')ans++;
                }
            max=Math.max(max,ans+1);
        }
        return max;
    }
}