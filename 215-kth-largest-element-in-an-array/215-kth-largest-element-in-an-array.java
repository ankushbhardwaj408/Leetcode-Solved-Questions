class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int x=k;
        int n=nums.length;
        int ans=0;
        while(x>0 && n>0)
        {
             ans=nums[n-1];
            n--;
            x--;
        }
        return ans;
    }
}