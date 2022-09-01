class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1) return intervals;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> ans=new ArrayList<>();
        ans.add(intervals[0]);
        int j=0;
        for(int i=1;i<intervals.length;i++)
        {
            int[] current=ans.get(j);
            if(current[1]>=intervals[i][0])
            {
                current[1]=Math.max(intervals[i][1],current[1]);
            }else{
                ans.add(intervals[i]);
                j++;
            }
        }
    return ans.toArray(new int[ans.size()][]);
    }
}