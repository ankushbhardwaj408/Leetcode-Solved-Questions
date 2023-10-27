class Solution {
    public int maxArea(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int ans=Integer.MIN_VALUE;
        while(i<j)
        {
            int max=Math.min(nums[i],nums[j])*(j-i);
            ans=Math.max(ans,max);
            if(nums[i]<nums[j]){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
}