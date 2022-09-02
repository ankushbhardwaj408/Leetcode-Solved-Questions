class Solution {
    public int[] frequencySort(int[] nums) {
       List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int x:nums)
        {
            list.add(x);
            ans.put(x,ans.getOrDefault(x,0)+1);
        }
       
        
        Collections.sort(list,(a,b)->
                    {
                       int x=ans.get(a);
                        int y=ans.get(b);
                        if(x==y) return b-a;
                        return x-y;
                        
                    });
      for(int i=0;i<nums.length;i++)
      {
          nums[i]=list.get(i);
      }
     
        return nums;
    }
}