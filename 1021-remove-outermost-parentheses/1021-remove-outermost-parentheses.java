class Solution {
    public String removeOuterParentheses(String s) {
       List<String> ans=new ArrayList<>();
        int sum=0;
        int start=0;
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(') sum+=1;
            if(s.charAt(i)==')') sum-=1;
            if(sum==0)
            {
                int end=i+1;
                ans.add(s.substring(start,end));
                start=end;
            }
        }
        StringBuilder a=new StringBuilder();
        for(int j=0;j<ans.size();j++)
        {
            int size=ans.get(j).length();
            a.append(ans.get(j).substring(1,size-1));
        }
        return a.toString();
    }
}