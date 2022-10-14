class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        return (split(a,b) || split(b,a));
    }
    public boolean split(String a,String b)
    {
        int i=0;
        int j=a.length()-1;
        while(  i<=j && a.charAt(i)==b.charAt(j))
        {
            i++;
            j--;
            
        }
    return (palin(a,i,j) || palin(b,i,j));
        
    }
    public boolean palin(String s,int a,int b)
    {
        while(a<=b)
        {
            if(s.charAt(a)!=s.charAt(b)) return false;
            a++;
            b--;
        }
        return true;
    }
}