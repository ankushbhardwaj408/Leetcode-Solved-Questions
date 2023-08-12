class Solution {
    public int trap(int[] height) {
        int[] left =new int[height.length];
        int[] right =new int[height.length];
       int max=height[0];
        left[0]=max;
        for(int i=1;i<left.length;i++)
        {
            max=Math.max(max,height[i]);
            left[i]=max;
        }
          max=height[left.length-1];
         right[left.length-1]=max;
        for(int i=left.length-2;i>=0;i--)
        {
           
              max=Math.max(max,height[i]);
right[i]=max;
        }
        int ans=0;
        for(int i=0;i<left.length;i++)
        {
            ans+=Math.abs(Math.min(left[i],right[i])-height[i]);
        }
        return ans;
    }
}