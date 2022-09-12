class Solution {
    public List<String> cellsInRange(String s) {
     List<String> ans=new ArrayList<>();
        char x=s.charAt(0);
        char n=s.charAt(3);
         char y=s.charAt(1);

         char n1=s.charAt(4);
       for(char i=x;i<=n;i++)
       {
           for(char j=y;j<=n1;j++)
           {
             ans.add(""+i+j);
             }
       }
        return ans;
    }
}