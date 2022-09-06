class Solution {
    public boolean isPowerOfTwo(int n) {
          if(n<1) return false;
        if(n==1) return true;
        // double c=n;
        // while(c>2)
        // {
        //     c=c/2;
        // }
        // if(c==2) return true;
        // return false;
        
     return n>0&&(n&(n-1))==0;
      
    }
}