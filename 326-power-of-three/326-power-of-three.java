class Solution {
    public boolean isPowerOfThree(int n) {
         if(n<1) return false;
        if(n==1) return true;
        // double c=n;
        // while(c>3)
        // {
        //     c=c/3;
        // }
        // if(c==3) return true;
        if(n%3==0)
        {
           return isPowerOfThree(n/3);
        }
        
        return false;
    }
}