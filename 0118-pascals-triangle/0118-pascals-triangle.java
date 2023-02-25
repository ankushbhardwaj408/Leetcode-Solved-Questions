class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ans12=new ArrayList<>();
        ans12.add(1);
        ans.add(ans12);
        for(int i=0;i<numRows-1;i++)
        {
              List<Integer> ans1=new ArrayList<>();
              ans1.add(1);
            for(int j=0;j<ans.get(i).size()-1;j++){
               int x=ans.get(i).get(j)+ans.get(i).get(j+1);
                ans1.add(x);
            }
            ans1.add(1);
            ans.add(ans1);
        }
        return ans;
    }
}