class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)continue;
            int start=i;
            while(i<nums.length && nums[i]==0 ) 
            {
                ans=ans+(i-start)+1;
                i++;
            }
            
        }
        return ans;
    }
}