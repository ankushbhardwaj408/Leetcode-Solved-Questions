class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1) return;
        int i=0;
        int j=1;
        while(i<nums.length && j<nums.length)
        {
         if(nums[i]==0 && nums[j]!=0)
         {
             swap(nums,i,j);
             i++;
             j++;
         }else if(nums[j]==0 && nums[i]!=0)
         {
             i++;
             j++;
         }else if(nums[j]!=0 && nums[i]!=0){
            i++;
             j++;
        }else if(nums[j]==0 && nums[i]==0)
        {
            j++;
        }
    }
    }
    public void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}