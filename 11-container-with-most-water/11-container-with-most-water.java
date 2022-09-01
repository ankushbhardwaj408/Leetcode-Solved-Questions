class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int sum=0;
        while(start<end)
        {
            if(height[start]<height[end])
            {
                sum=Math.max(sum,height[start]*(end-start));
                start++;
            }else{
                sum=Math.max(sum,height[end]*(end-start));
                end--;
            }
        }
        return sum;
    }
}