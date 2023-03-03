class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
    List<List<Integer>> ans=new ArrayList<>();
        fun(ans,new ArrayList<>(),0,nums);
        return ans;
    }
    public void fun(List<List<Integer>> ans,List<Integer> list,int index,int[] nums)
    {
        if(index==nums.length){
            if(!ans.contains(list)){
                 ans.add(new ArrayList(list));
            }
           
            return;
        }
        fun(ans,list,(index+1),nums);
        list.add(nums[index]);
         fun(ans,list,(index+1),nums);
        list.remove(list.size()-1);
    }
}