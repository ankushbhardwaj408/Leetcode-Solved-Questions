class Solution {
    public int subsetXORSum(int[] nums) {
      
     return helper(nums,0,0);
    }
    int helper(int[] nums,int level,int xor)
    {
        if(level==nums.length) return xor;
        int inc=helper(nums,level+1,xor^nums[level]);
        int exc=helper(nums,level+1,xor);
        return inc+exc;
    }
}