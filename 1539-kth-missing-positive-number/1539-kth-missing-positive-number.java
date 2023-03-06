class Solution {
    public int findKthPositive(int[] arr, int k) {
        int s=0;
        int e=arr.length-1;
        int ans=-1;
        int mid=0;
        while(s<=e)
        {
             mid=s+(e-s)/2;
            
             if(arr[mid]-(mid+1)<k){
                s=mid+1;
                
            }else if(arr[mid]-(mid+1)>=k){
                e=mid-1;
            }
                
        }
        if(e==-1)
        {
            return k;
        }else{
            ans=arr[e]+(k-(arr[e]-(e+1)));
        }
        
       return ans;
    }
}