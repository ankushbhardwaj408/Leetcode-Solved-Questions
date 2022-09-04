class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        return (check(a,b) || check(b,a));
    }
    public boolean check(String a,String b)
    {
        int i=0;
        int j=b.length()-1;
        while(i<j && a.charAt(i)==b.charAt(j))
        {
            i++;
            j--;
            
        }
        if(i>=j) return true;
        return (Palin(a.substring(i,j+1)) || Palin(b.substring(i,j+1)));
    }
    public boolean Palin(String s)
    {
          int i=0;
        int j=s.length()-1;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}