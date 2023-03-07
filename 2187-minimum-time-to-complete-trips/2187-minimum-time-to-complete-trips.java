class Solution {
    public long minimumTime(int[] time, int totalTrips) {
       long i=0;
        long j=100000000000000l;
        long ans=j;
        while(i<j)
        {
            long mid=(i+j)/2;
            long cur=0;
            
            for(int k=0;k<time.length;k++)
            {
                cur=cur+(mid/time[k]);
            }
            if(cur>=totalTrips)
            {
                ans=Math.min(ans,mid);
                j=mid;
            }else{
                i=mid+1;
            }
            
        }
        return ans;
    }
}