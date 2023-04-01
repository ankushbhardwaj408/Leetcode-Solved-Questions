class Solution {
    public int search(int[] nums, int target) {
        int i=0;
        int j=nums.length;
        while(i<j)
        {
            int mid=i+(j-i)/2;
            if(nums[mid]==target)return mid;
            if(nums[mid]<target)
            {
                i=mid+1;
                
            }else{
                j=mid;
            }
        }
        return -1;
    }
}