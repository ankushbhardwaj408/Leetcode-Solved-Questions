class Solution {
    public int maxValue(int n, int index, int maxSum) {
         long l=index;
        long r=n-index-1;
      
        long i=1;
    long j=maxSum;
     long ans=0;
        
        while(i<=j)
        {
            
            long mid=i+(j-i)/2;
           
        long sum=mid;
        long m=mid-1;
              long ls=0;
        long rs=0;
        if(l<=m)
        {
            ls=m*(m+1)/2-(m-l)*(m-l+1)/2;
            
        }else{
            ls=m*(m+1)/2+1*(l-m);
        }
         if(r<=m)
        {
            rs=m*(m+1)/2-(m-r)*(m-r+1)/2;
            
        }else{
            rs=m*(m+1)/2+1*(r-m);
        }
        sum+=rs+ls;
            if(sum==maxSum)
            {
                return (int)mid;
            }else if(sum>maxSum){

                
                 j=mid-1;
            }else{
              
                 i=mid+1;
            }
        }
        
        return (int)j;
        
        
    }
   
}