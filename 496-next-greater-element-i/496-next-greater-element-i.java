class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i=0;i<nums1.length;i++)
        {
            nums1[i]=find(nums1[i],nums2);
        }
        return nums1;
    }
    public int find(int n,int[] nums2)
    {
        for(int i=0;i<nums2.length;i++)
        {
            if(n==nums2[i])
            {
                while(i<nums2.length)
                {
                    if(nums2[i]>n) return nums2[i];
                    i++;
                }
            }
        }
        return -1;
    }
}