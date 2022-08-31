class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-2;i++)
        {
            if(nums[i]>0) break;
            int left=i+1;
            int right=n-1;
            while(left<right)
            {
                int sum=nums[i]+nums[left]+nums[right];
                if(sum>0)
                {
                    right--;
                }else if(sum<0)
                {
                    left++;
                }else{
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    ans.add(temp);
                    left++;
                    right--;
                      while(left<right&& nums[left]==nums[left-1]) left++;
                while(left<right && nums[right]==nums[left-1]) right++;
                    
                }
              
            }
            while(i+1<n && nums[i]==nums[i+1]) i++;
        }
        return ans;
    }
}