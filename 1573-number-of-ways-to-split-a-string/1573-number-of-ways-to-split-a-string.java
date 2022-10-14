class Solution {
    public int numWays(String s) {
        long ones=0;
        long n=s.length();
        long Mod=1_000_000_007;
        for (char c : s.toCharArray()) {
            ones += c - '0';
        }
        if(ones==0) return (int)(((n-1)*(n-2))/2%Mod);
        if(ones%3!=0) return 0;
        
        long req=ones/3;
        ones=0;
        long way1=0;
        long way2=0;
         for(int j=0;j<s.length();j++)
        {
            if(s.charAt(j)=='1') ones++;
             if(ones==req)way1++;
              if(ones==2*req)way2++;
             
        }
        return (int) ((way1*way2)%Mod);
    }
}