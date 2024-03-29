class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> ans=new ArrayList<>();
        for(int[] interval:intervals)
        {
            if(newInterval[0]>interval[1])
            {
                ans.add(interval);
            }else if(newInterval[1]<interval[0]){
                ans.add(newInterval);
                newInterval=interval;
            }else  if (interval[1] >= newInterval[0] || interval[0] <= newInterval[1]) {
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            }
        }
         ans.add(newInterval);
       
        return ans.toArray(new int[ans.size()][]);
    }
}