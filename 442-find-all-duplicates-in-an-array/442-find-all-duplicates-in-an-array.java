class Solution {
    public List<Integer> findDuplicates(int[] nums) {
          int i=0;
        while(i<nums.length)
        {
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else i++;
        }
        List<Integer> ans=new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(j!=nums[j]-1){
                ans.add(nums[j]);
            }
        }
        return ans;
    }
    void swap(int[] a,int first,int last)
    {
        int temp=a[first];
        a[first]=a[last];
        a[last]=temp;
    }
    
}