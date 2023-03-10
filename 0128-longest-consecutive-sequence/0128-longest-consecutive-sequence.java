class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Arrays.sort(nums);
        int ans=0;
        int cur=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])continue;
            if(nums[i]-nums[i-1]==1){
                cur++;
                ans=Math.max(cur,ans);
            }else{
                cur=0;
            }
        }
        return ans+1;
    }
}