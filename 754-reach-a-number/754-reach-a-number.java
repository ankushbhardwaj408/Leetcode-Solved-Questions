class Solution {
    public int reachNumber(int target) {
        if(target==0) return 0;
        target=Math.abs(target);
  int step=0;
        int sum=0;
        while(target>sum)
        {
            sum+=step;
            step++;
        }
        while((sum-target)%2==1)
        {
            sum+=step;
            step++;
        }
        return step-1;
    }
}