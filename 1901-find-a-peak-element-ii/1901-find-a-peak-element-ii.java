class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int rs=0;
        int re=mat.length-1;
        while(rs<=re)
        {
            int mid=rs+(re-rs)/2;
            int romax=fun(mat[mid]);
            if(mid==0)
            {
                if(mat[mid][romax]>mat[mid+1][romax])
                {
                    return new int[]{mid,romax};
                }
            } if(mid==mat.length-1)
            {
                if(mat[mid][romax]>mat[mid-1][romax])
                {
                    return new int[]{mid,romax};
                }
            } if(mat[mid][romax]>mat[mid+1][romax] && mat[mid][romax]>mat[mid-1][romax])
            {
                return new int[]{mid,romax};
            } if(mat[mid][romax]<mat[mid+1][romax])
            {
                rs=mid+1;
            }else{
                re=mid-1;
            }
            }
        
        return new int[]{-1,-1};
    }
    public int fun(int[] nums)
    {
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>nums[max])
            {
                max=i;
            }
        }
        return max;
    }
}