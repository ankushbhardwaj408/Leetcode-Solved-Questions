class Solution {
    public String longestPalindrome(String s) {
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++)
        {
            int len1=exp(s,i,i);
             int len2=exp(s,i,i+1);
            int len=Math.max(len1,len2);
            if(len>end-start+1)
            {
                start=i-(len-1)/2;
                end=i+len/2;
            }
            
        }
        return s.substring(start,end+1);
    } 
    public int exp(String s,int left,int right)
    {
        if(s==null || s.length()<1)return 0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        return right-left-1;
    }
}