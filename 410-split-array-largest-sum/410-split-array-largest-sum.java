class Solution {
    public int splitArray(int[] nums, int m) {
        int s=0;
        int e=0;
        for(int i=0;i<nums.length;i++)
        {
            s=Math.max(s,nums[i]);
            e+=nums[i];
        }
       
        while(s<e)
        {
            int mid=s+(e-s)/2;
             int sum=0;
        int peices=1;
            for(int num:nums)
            {
                if(sum+num>mid)
                {
                    sum=num;
                    peices++;
                }else{
                    sum+=num;
                }
            }
            if(peices>m)
            {
                s=mid+1;
            }else{
                e=mid;
            }
        }
        return e;
    }
}