class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=i+1;
        }
         List<List<Integer>> ans=new ArrayList<>();
        fun(ans,new ArrayList<>(),0,nums,k);
        return ans;
    }
     public void fun(List<List<Integer>> ans,List<Integer> list,int index,int[] nums,int k)
    {
        if(index==nums.length){
            if(list.size()==k){
                ans.add(new ArrayList(list));
            }
            
            return;
        }
        fun(ans,list,(index+1),nums,k);
        list.add(nums[index]);
         fun(ans,list,(index+1),nums,k);
        list.remove(list.size()-1);
    }
}