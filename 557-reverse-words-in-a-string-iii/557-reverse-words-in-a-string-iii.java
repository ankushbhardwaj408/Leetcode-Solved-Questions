class Solution {
    public String reverseWords(String s) {
        String[] ans=s.split(" ");
        StringBuilder j=new StringBuilder();
        for(int i=0;i<ans.length;i++)
        {
            StringBuilder r=new StringBuilder(ans[i]);
          j.append(r.reverse()+" ");
            
        }
       return j.toString().trim();
    }
}