class Solution {
    public int[] frequencySort(int[] nums) {
      Arrays.sort(nums);
       List<Integer> list=new ArrayList<>();
        for(int j=nums.length-1;j>=0;j--)
        {
             list.add(nums[j]);
        }
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int x:nums)
        {
           
            ans.put(x,ans.getOrDefault(x,0)+1);
        }
       
        
        Collections.sort(list,(a,b)->(ans.get(a)).compareTo(ans.get(b)));
                    
      for(int i=0;i<nums.length;i++)
      {
          nums[i]=list.get(i);
      }
     
        return nums;
    }
}