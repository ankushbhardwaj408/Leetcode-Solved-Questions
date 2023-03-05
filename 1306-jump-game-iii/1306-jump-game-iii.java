class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean[]  vis=new boolean[arr.length];
        boolean ans=fun(arr,start,vis);
        return ans;
    }
    public boolean fun(int[] nums,int index,boolean[] vis)
    {
        if(index>=nums.length || index<0)return false;
        if(vis[index])return false;
        if(nums[index]==0)return true;
        vis[index]=true;
        boolean x=fun(nums,index+nums[index],vis);
        
          boolean y=fun(nums,index-nums[index],vis);
        
        return x||y;
    }
}