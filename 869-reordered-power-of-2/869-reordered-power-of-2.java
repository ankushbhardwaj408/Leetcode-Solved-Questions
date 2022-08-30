class Solution {
    public boolean reorderedPowerOf2(int n) {
        int x=1;
        int[] ans=count(n);
        for(int i=0;i<31;i++)
        {
            if(Arrays.equals(ans,count(x)))
            {
                return true;
            }
            x<<=1;
        }
        return false;
    }
    public int[] count(int n)
    {
        int[] ans=new int [10];
        while(n!=0)
        {
            ans[n%10]++;
            n/=10;
        }
        return ans;
    }
}