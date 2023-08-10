class Solution {
    public int[] decompressRLElist(int[] nums) {
       ArrayList<Integer> lis=new ArrayList<>();
        
        for(int i=0;i<nums.length;i=i+2){
            while(nums[i]>0){
                lis.add(nums[i+1]);
                nums[i]=nums[i]-1;
            }
        }
        int[] ans=new int[lis.size()];
        int i=0;
        for(int x:lis)
        {
            ans[i++]=x;
        }
        return ans;
    }
}