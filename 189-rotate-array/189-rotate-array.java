class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        rev(0,nums.length-1,nums);
        rev(0,k-1,nums);
        rev(k,nums.length-1,nums);
    }
    public void rev(int i,int j,int[] nums)
    {
        while(i<j)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}