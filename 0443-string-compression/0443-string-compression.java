class Solution {
    public int compress(char[] chars) {
        if(chars.length==1)return chars.length;
        int n=chars.length;
        String s="";
        for(int i=0;i<chars.length-1;i++)
        {
            int c=0;
            while(i<chars.length-1 && chars[i]==chars[i+1])
            {
                c++;
                i++;
            }
            
            s=s+chars[i];
if(c>0){
    s=s+(c+1);
}
           
        }
         if(chars[n-1]!=chars[n-2]){
                s=s+chars[n-1];
            }
        char[] ans=s.toCharArray();
       for(int j=0;j<ans.length;j++)
       {
           chars[j]=ans[j];
       }
        return ans.length;
    }
}