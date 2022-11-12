//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[n];
            String[] str = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(str[i]);
            }

            Solution ob = new Solution();
            
            long res[] = ob.factorial(a,n);
            
            for (int i=0; i<n; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public long[] factorial(long a[], int n) {
        long max=0;
        for(int i=0;i<a.length;i++)
        {
             max=Math.max(max,a[i]);
        }
      long[] dp=new long[(int)max+1];
      dp[0]=1;
      
      dp[1]=1;
      dp[2]=2;
      for(int j=3;j<dp.length;j++)
      {
          dp[j]=(j*dp[j-1])%1_000_000_007;
      }
      for(int k=0;k<a.length;k++)
      {
          a[k]=dp[(int)a[k]];
      }
      return a;
    }
  
}