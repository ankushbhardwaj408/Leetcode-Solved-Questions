class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<1) return false;
        if(n==1) return true;
        double c=n;
        while(c>4)
        {
            c=c/4;
        }
        if(c==4) return true;
        return false;
    }
}