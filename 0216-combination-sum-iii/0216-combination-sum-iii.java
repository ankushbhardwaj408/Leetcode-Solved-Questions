class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
          int[] nums=new int[9];
        for(int i=0;i<10-1;i++)
        {
            nums[i]=i+1;
        }
         List<List<Integer>> ans=new ArrayList<>();
        fun(ans,new ArrayList<>(),0,nums,k,n);
        return ans;
    }
     public void fun(List<List<Integer>> ans,List<Integer> list,int index,int[] nums,int k,int n)
    {
        if(index==nums.length){
            if(list.size()==k){
                int sum=0;
                for (int i = 0; i < list.size(); i++)
           sum += list.get(i);
                if(n==sum){
                     ans.add(new ArrayList(list));
                }
               
            }
            
            return;
        }
        fun(ans,list,(index+1),nums,k,n);
        list.add(nums[index]);
         fun(ans,list,(index+1),nums,k,n);
        list.remove(list.size()-1);
    }
}