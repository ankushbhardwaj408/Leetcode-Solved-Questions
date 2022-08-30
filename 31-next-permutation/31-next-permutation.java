class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
       
        
            while(i>=0 && nums[i]>=nums[i+1]) i--;
            int j=nums.length-1;
        if(i>=0)
        {
             while(j>=0 && nums[i]>=nums[j]) j--;
            swap(nums,i,j);
        }
           
        
        rev(nums,i+1,nums.length-1);
        
    }
    public void rev(int[] nums,int i,int j)
    {
        while(i<=j) {
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    
    
    public void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}