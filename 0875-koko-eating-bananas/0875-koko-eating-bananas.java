class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int l=1;
        int r=piles[piles.length-1];
       
        while(l<=r)
        {
            int mid=l+(r-l)/2;
        
            if(   fun(piles,h,mid))
            { 
                  r=mid-1;
              
               
            }else{
               l=mid+1;
            }
        }
            return l;
    }
    public boolean fun(int[] piles,int h,int m)
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