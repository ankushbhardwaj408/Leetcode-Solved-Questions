class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int pro=1;
        int prow=1;
        int c=0;
        boolean sum=true;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
              
                c++;
            }
            
             if(nums[i]!=0)
            {
              
                sum=false;
            }
            
            if(nums[i]==0)
            {
                            prow*=1;

               
              
            }else{
            prow*=nums[i];
            }
              pro*=nums[i];
        }
      for(int j=0;j<nums.length;j++)
      {
          if(pro==0 && prow==1 && sum)
          {
              ans[j]=0;
          }
          else if(nums[j]==0 && c==1)
          {
              ans[j]=prow;
          }else if(nums[j]==0 && c>1)
          {
              ans[j]=pro;
          }else{
              ans[j]=pro/nums[j];
          }
      }
        return ans;
    }
   
}