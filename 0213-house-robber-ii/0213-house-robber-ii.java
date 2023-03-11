class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
         if(nums.length==2)return Math.max(nums[0],nums[1]);
        int[] arr1=new int[nums.length-1];
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=nums[i];
        }
         int[] arr2=new int[nums.length-1];
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=nums[i+1];
        }
        int x=Math.max(rob2(arr1),rob2(arr2));
        return Math.max(nums[0],x);
    }
     public int rob2(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
      int[] dp=new int[nums.length+1];
        dp[0]=0;
        dp[1]=nums[0];
        for(int i=1;i<dp.length-1;i++)
        {
            dp[i+1]=Math.max(dp[i],dp[i-1]+nums[i]);
        }
        return dp[dp.length-1];
    }
}