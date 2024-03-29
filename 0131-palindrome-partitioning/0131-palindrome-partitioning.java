class Solution {
    List<List<String>> ans=new ArrayList<>();
    public List<List<String>> partition(String s) {
        fun(s,0,new ArrayList<>());
        return ans;
    }
    public void fun(String s,int start,List<String> list)
    {
        if(s.length()==start){
            ans.add(new ArrayList(list));
            return ;
        }
        for(int i=start;i<s.length();i++)
        {
            if(isPalindrome(s,start,i)){
                list.add(s.substring(start,i+1));
                fun(s,i+1,list);
                list.remove(list.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s,int start,int end)
    {
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
            
        }
        return true;
    }
}