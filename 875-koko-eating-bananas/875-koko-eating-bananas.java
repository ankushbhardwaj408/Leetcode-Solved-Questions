class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int l=1;
        int high=1_000_000_000;
        while(l<=high)
        {
            int m=l+(high-l)/2;
            if(is(piles,h,m))
            {
                high=m-1;
            }else{
                l=m+1;
            }
        }
        return l;
    }
    
    
    public boolean is(int[] piles,int h,int m)
    {
        int time=0;
        for(int p:piles)
        {
            time+=(p-1)/m+1;
            if(time>h) break;
            
                
        }
        return time<=h;
    }
}