class Solution {
    public int search(int[] nums, int target) {
        int i=0;
        int j=nums.length;
        while(i<j)
        {
            int mid=(j+i)/2;
            if(target==nums[mid])return mid;
            if(target>nums[mid]){
               i=mid+1;
                
            }else{
               j=mid;
            }
        }
        return -1;
    }
}