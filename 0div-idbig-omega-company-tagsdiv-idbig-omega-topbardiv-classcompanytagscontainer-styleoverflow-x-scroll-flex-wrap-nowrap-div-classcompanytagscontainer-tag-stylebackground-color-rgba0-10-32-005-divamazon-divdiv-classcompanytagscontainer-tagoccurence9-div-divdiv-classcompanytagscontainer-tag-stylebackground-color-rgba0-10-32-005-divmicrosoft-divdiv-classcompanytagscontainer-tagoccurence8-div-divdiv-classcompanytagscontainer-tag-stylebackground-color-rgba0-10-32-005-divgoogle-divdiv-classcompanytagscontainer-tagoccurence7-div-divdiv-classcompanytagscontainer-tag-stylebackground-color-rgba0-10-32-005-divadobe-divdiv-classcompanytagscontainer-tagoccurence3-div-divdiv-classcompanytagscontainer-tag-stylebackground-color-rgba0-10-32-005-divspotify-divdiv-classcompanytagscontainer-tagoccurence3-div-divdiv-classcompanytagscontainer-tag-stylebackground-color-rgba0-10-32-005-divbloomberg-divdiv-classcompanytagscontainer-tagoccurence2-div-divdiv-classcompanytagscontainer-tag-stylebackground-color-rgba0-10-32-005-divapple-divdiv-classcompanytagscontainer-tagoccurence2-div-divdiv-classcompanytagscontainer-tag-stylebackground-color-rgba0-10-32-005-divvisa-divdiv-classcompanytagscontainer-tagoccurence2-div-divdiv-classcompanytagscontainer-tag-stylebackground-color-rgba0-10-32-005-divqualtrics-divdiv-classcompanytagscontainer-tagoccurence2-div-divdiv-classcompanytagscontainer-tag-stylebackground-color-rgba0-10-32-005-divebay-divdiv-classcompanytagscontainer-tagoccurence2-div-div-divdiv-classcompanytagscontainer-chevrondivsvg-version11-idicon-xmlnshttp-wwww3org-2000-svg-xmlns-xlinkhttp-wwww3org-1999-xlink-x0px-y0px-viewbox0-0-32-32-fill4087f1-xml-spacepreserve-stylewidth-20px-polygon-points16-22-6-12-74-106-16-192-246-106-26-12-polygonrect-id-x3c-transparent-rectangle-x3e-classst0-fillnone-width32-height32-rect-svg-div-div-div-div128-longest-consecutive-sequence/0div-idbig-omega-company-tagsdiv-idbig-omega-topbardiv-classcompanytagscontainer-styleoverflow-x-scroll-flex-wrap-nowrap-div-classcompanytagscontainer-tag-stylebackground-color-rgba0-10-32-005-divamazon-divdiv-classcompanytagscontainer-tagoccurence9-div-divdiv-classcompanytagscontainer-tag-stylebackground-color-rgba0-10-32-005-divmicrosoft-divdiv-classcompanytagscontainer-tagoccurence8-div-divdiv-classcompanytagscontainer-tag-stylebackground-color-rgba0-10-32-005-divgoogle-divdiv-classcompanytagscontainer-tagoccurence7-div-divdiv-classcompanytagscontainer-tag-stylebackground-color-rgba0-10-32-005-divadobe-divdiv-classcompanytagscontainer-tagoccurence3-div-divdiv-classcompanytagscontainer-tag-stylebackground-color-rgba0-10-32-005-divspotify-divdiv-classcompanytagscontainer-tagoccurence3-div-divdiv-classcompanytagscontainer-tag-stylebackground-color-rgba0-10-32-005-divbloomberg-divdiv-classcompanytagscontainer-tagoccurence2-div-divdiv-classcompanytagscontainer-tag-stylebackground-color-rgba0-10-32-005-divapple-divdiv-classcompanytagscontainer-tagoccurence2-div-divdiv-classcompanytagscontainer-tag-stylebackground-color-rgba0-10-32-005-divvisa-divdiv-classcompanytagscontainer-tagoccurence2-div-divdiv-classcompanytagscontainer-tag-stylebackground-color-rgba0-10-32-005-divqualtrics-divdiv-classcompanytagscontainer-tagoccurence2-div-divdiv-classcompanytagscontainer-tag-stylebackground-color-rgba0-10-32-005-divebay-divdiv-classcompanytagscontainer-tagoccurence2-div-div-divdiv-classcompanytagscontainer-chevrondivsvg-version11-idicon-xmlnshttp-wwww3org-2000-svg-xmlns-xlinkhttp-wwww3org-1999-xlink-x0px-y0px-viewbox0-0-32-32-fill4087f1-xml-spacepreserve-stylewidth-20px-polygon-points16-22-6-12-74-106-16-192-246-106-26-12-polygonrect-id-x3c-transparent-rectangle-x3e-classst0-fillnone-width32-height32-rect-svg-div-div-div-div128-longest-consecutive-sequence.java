class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]-1))
            {
                int x=map.get(nums[i]-1);
                map.put(nums[i],x+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            int k=entry.getValue();
            ans=Math.max(ans,k);
        }
        return ans;
    }
}