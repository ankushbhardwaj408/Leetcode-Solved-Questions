class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int correct=nums[i]-1;
            if(nums[correct]!=nums[i])
            {
                swap(nums,correct,i);
              
            }else{
                 i++;
            }
           
        }
        for(int j=1;j<nums.length;j++)
        {
            if(nums[j]-1!=j) return nums[j];
        }
        return -1;
    }
     void swap(int[] a,int first,int last)
    {
        int temp=a[first];
        a[first]=a[last];
        a[last]=temp;
    }
}