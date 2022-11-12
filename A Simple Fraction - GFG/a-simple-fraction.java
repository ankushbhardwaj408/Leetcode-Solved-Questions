//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().trim().split(" ");
            int numerator = Integer.parseInt(S[0]);
            int denominator = Integer.parseInt(S[1]);
            Solution ob = new Solution();
            String ans = ob.fractionToDecimal(numerator, denominator);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String  fractionToDecimal(int num, int den)
    {
       String ans="";
      ans+=num/den;
      int rem=num%den;
      num=rem;
      if(num==0)
      {
          return ans;
      }
      HashMap<Integer,Integer> map=new HashMap<>();
     
      String frac="";
      while(num!=0 && !map.containsKey(num)){
          map.put(num,frac.length());
          num=num*10;
          frac+=num/den;
          rem=num%den;
          num =rem;
      }
      if(num==0)
      {
         
          return ans+"."+frac;
      }else{
      int index=map.get(num);
      frac=frac.substring(0,index)+"("+frac.substring(index)+")";
   return ans+"."+frac;
      }
      
    }
}