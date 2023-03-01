class Solution {
    public int[] sortArray(int[] nums) {
        fun(nums,0,nums.length);
        return nums;
    }
    public void fun(int[] nums,int s,int e){
        if(e-s==1)return;
     
        int mid=(e+s)/2;
        fun(nums,s,mid);
        fun(nums,mid,e);
        merge(nums,s,mid,e);
        
    }
    public void merge(int[] nums,int s,int mid,int e)
    {
        int i=s;
        int j=mid;
       
        int[] ans=new int[e-s];
        int k=0;
        while(i<mid && j<e)
        {
            if(nums[i]<=nums[j])
            {
                ans[k++]=nums[i++];
                
            }else
              {
                ans[k++]=nums[j++];
                
            }
        }
        while(i<mid)
        {
             ans[k++]=nums[i++];
        }
         while(j<e)
        {
             ans[k++]=nums[j++];
        }
        for(int l=0;l<ans.length;l++)
        {
            nums[l+s]=ans[l];
        }
    }
}