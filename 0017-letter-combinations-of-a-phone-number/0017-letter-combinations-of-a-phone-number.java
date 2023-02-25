class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> ans=new LinkedList();
         if(digits.length()==0)return ans;
        ans.add("");
        String[] num={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        for(int i=0;i<digits.length();i++)
        {
             int index=Character.getNumericValue(digits.charAt(i));
        while(ans.peek().length()==i)
        {
            String perm=ans.remove();
            for(char c:num[index].toCharArray()){
                ans.add(perm+c);
            }
        }
        }
        return ans;
    }
}