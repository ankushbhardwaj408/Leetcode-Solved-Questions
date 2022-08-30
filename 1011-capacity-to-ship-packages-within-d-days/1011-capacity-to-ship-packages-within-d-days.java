class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int sum=0;
        for(int v:weights)
        {
            sum+=v;
            max=Math.max(v,max);
        }
        int s=max;
        int e=sum;
        int ans=0;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(fun(weights,mid,days))
            {
                ans=mid;
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return ans;
    }
    public boolean fun(int[] nums,int mid,int days)
    {
        int c=1;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            if(sum>mid)
            {
                c++;
                sum=nums[i];
            }
        }
        return (c<=days);
    }
}