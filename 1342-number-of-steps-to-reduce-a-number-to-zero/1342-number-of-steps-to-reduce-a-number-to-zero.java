class Solution {
    public int numberOfSteps(int num) {
      return find(num,0);
    }
    int find(int n,int steps)
    {
        if(n==0) return steps;
        if(n%2==0) return find(n/2,steps+1);
        return find(n-1,steps+1);
    }
}