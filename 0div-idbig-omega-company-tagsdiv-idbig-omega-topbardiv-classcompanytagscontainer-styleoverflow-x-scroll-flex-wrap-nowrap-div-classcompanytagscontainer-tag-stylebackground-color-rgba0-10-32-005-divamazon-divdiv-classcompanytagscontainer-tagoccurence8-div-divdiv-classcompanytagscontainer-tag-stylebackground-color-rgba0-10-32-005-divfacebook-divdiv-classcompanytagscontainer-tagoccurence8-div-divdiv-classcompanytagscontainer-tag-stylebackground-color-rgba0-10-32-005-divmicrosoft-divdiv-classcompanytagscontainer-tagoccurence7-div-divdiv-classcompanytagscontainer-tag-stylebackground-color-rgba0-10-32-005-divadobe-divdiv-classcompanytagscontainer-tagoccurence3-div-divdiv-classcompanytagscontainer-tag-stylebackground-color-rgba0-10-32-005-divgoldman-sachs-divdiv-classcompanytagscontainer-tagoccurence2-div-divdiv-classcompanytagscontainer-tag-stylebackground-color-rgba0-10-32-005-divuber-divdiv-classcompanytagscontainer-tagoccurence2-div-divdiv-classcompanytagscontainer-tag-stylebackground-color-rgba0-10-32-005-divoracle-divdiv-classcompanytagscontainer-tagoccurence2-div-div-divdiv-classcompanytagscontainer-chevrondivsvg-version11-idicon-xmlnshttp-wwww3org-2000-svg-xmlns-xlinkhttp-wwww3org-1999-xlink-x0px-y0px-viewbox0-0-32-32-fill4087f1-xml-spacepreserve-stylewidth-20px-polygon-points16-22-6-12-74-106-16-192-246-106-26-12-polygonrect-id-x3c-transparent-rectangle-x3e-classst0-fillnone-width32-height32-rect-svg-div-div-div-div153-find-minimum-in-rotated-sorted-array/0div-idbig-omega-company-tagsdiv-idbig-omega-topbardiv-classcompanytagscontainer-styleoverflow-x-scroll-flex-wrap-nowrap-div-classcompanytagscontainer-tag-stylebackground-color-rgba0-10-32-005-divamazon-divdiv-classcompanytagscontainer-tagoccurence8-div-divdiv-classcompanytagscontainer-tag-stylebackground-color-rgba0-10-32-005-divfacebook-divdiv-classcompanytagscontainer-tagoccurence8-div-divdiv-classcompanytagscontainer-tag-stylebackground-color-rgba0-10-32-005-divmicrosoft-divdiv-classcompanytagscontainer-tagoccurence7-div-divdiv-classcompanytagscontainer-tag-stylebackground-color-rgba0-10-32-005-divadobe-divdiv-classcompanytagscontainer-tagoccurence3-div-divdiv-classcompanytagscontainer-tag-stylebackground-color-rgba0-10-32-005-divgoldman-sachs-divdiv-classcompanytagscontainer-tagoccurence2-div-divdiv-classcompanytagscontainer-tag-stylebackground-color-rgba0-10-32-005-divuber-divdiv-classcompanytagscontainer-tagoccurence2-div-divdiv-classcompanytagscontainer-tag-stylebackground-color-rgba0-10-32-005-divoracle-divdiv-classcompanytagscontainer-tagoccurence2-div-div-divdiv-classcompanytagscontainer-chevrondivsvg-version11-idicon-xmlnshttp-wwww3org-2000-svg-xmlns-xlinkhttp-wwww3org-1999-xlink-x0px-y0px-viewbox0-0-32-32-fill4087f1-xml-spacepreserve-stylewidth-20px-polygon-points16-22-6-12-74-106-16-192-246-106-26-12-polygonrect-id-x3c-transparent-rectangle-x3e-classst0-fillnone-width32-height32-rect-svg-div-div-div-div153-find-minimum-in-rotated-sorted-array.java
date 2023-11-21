class Solution {
    public int findMin(int[] nums) {
      if(nums[0]<nums[nums.length-1]) return nums[0];
        if(nums.length==1) return nums[0];
        int i=0;
        int j=nums.length-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(mid<j && nums[mid]>nums[mid+1])
            {
                return nums[mid+1];
            }else if(mid>i && nums[mid]<nums[mid-1])
            {
                return nums[mid];
            }else if(nums[i]<nums[mid])
            {
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return -1;
    }
}