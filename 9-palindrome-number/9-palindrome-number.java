class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int ne =0;
        int y=x;
        while(x!=0)
        {
            int r=x%10;
            ne=ne*10+r;
            x=x/10;
        }
        return (y==ne);
    }
}