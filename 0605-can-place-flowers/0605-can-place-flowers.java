class Solution {

    public boolean canPlaceFlowers(int[] nums, int n) {
        if(n==0)return true;
        
     
        for (int i = 0; i < nums.length ; i++) {
          if(nums[i]==0 && is(nums,i))
          {
              nums[i]=1;
              n--;
               if (n == 0) return true;
          }
        }
       
        return false;
    }
    public boolean is(int[] nums,int i)
    {
      
         if((i-1>=0 && nums[i-1] == 1) || (i+1<nums.length && nums[i+1] ==1)) {
			 return false;
		 
       }
        return true;
    }
}
