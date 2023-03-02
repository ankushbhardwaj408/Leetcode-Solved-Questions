class Solution {

    public List<List<Integer>> combinationSum(int[] nums, int target) {
       List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        fun(0,target,ans,nums,list,0);
      
        return ans;
    }

    public void fun(int sum, int target, List<List<Integer>> ans, int[] nums, List<Integer> list,int i) {
      
        if (sum == target) {
           List<Integer> l= new ArrayList(list);
          
                 ans.add(l);
            
           
                           return;
                           }
        if(sum>target){
            return;
        }
         for(int start=i;start<nums.length;start++)
        {
              list.add(nums[start]);
        fun((sum+nums[start]),target,ans,nums,list,start);
        
        list.remove(list.size()-1);
        }
       
      

        
    }
}
