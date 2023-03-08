class Solution {
    public int maximumCandies(int[] candies, long k) {
    Arrays.sort(candies);
        int l=1;
        int r=candies[candies.length-1];
       
        while(l<=r)
        {
            int mid=l+(r-l)/2;
        long t= fun(candies,k,mid);
            if(  t<k)
            { 
                  r=mid-1;
              
               
            }else{
               l=mid+1;
            }
        }
            return r;
    }
    public long fun(int[] nums,long k,int mid)
    {
        long time=0;
        for(int p:nums)
        {
           if(mid!=0)
           {
                time+=p/mid;
           }
                
            
           
           
            
                
        }
        return time;
    }
}