class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{first(nums,target),last(nums,target)};
        
    }
    public int first(int[] nums,int target)
    {
        int ans=-1;
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            
          int  mid=s+(e-s)/2;
            if(nums[mid]==target){
                 ans=mid;
                e=mid-1;
                
            }
            else if(nums[mid]<target)
            {
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
             return ans;
        }
           
    
    
    
    
    
    
    
    public int last(int[] a,int target)
    {
        int ans=-1;
        int s=0;
        int e=a.length-1;
        while(s<=e){
            
          int  mid=s+(e-s)/2;
            if(a[mid]==target){
                 ans=mid;
                s=mid+1;
                
            }
            else if(a[mid]<target)
            {
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
             return ans;
        }
        }
        
        
        
    
