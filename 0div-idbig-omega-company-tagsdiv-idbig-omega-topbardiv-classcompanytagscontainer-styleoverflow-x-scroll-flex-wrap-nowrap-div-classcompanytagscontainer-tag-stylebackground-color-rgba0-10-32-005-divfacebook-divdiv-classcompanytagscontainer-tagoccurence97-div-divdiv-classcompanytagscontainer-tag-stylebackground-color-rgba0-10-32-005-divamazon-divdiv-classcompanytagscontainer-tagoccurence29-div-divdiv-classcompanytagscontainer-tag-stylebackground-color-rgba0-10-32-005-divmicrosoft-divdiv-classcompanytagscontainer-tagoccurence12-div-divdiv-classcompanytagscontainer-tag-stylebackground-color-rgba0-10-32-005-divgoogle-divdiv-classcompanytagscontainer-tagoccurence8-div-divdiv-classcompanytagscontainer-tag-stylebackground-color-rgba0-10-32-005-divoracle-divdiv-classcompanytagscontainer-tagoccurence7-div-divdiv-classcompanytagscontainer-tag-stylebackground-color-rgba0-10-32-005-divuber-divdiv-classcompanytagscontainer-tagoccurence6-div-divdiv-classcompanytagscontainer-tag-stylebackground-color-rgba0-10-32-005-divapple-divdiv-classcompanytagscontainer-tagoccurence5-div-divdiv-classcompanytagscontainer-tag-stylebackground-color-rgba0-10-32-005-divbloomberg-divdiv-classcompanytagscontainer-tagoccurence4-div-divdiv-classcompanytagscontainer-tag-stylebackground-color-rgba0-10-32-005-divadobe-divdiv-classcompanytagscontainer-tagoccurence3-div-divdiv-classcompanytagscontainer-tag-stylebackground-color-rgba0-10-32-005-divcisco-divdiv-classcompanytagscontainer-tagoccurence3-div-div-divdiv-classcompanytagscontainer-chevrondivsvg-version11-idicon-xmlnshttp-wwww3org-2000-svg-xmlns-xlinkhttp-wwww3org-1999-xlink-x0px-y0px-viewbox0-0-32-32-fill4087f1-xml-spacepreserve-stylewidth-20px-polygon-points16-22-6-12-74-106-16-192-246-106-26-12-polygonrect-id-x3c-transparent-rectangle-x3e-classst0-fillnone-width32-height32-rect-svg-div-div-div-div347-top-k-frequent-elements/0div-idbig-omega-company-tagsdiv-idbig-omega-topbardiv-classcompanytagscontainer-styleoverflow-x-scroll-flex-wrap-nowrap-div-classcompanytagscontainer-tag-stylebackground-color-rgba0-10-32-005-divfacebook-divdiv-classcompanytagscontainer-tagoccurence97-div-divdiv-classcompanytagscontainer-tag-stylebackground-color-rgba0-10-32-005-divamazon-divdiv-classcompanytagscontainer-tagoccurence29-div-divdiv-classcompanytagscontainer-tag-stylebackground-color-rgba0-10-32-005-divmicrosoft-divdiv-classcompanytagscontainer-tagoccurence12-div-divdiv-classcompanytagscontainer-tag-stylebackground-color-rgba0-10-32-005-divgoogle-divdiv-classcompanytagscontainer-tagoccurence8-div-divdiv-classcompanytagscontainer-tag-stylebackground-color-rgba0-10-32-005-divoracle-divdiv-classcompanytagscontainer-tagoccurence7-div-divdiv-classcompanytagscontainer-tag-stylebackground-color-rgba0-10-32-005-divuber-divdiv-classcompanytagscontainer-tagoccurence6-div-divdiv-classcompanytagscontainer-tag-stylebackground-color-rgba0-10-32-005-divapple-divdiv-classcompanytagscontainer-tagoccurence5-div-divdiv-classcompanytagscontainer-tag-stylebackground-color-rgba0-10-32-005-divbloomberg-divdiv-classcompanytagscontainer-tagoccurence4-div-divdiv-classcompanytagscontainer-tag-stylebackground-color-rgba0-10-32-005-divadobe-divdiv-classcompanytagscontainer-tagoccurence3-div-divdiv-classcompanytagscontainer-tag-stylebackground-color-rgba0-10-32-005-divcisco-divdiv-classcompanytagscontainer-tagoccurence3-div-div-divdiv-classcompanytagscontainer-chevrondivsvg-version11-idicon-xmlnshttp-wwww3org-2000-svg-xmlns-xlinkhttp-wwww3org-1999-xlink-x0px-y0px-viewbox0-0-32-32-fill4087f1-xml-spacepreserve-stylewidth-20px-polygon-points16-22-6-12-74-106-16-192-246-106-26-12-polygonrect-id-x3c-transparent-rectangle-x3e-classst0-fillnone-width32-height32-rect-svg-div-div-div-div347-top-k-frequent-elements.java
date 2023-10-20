class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
       List<Map.Entry<Integer, Integer> > list =
               new LinkedList<Map.Entry<Integer, Integer> >(map.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>(){
            public int compare(Map.Entry<Integer, Integer> o1, 
                               Map.Entry<Integer, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        for(int i=0;i<k;i++)
        {
            ans[i]=list.get(i).getKey();
        }
        return ans;
    }
}