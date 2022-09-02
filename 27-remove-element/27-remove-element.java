class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0) return 0;
        int i=0;
        int j=nums.length-1;
        while(i<j)
        {
            if(nums[i]==val && nums[j]!=val)
            {
                swap(nums,i,j);
                i++;
                j--;
            
            }else{
                if(nums[i]!=val)
                {
                    i++;
                }
                if(nums[j]==val)
                {
                    j--;
                }
            }
            
        }
        if(nums[i]==val) return i;
        return i+1;
    }
    public void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}