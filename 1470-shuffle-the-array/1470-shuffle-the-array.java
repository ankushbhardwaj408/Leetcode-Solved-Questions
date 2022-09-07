class Solution {
    public int[] shuffle(int[] nums, int n) {
     int len=2*n;
        int[] ans=new int[len];
    int i=0;
        int j=n;
        int a=0;
        while(a<len)
      {
            ans[a++]=nums[i++];
            ans[a++]=nums[j++];
          
      }
        return ans;
    }
}