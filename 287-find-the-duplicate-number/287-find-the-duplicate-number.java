class Solution {
    public int findDuplicate(int[] nums) {
        
      int i=0;
        while(i<nums.length)
        {
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else i++;
        }
       
        for(int j=0;j<nums.length;j++){
            if(j!=nums[j]-1){
               return nums[j];
            }
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