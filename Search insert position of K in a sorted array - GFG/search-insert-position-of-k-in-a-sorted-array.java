//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            int k = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.searchInsertK(Arr, N, k));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int searchInsertK(int Arr[], int N, int k)
    {
        if(k<Arr[0]) return 0;
      int i=0;
      int j=N-1;
      int ans=0;
      while(i<=j)
      {
          int mid=i+(j-i)/2;
          if(Arr[mid]<k){
              ans=mid;
              i=mid+1;
          }else if(Arr[mid]>k){
              j=mid-1;
          }else{
              return mid;
          }
      }
      return ans+1;
    }
}