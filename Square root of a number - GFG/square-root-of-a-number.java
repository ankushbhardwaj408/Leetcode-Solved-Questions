//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			Solution obj = new Solution();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution
{
     long floorSqrt(long x)
	 {
	     if(x==1) return 1;
            long i=1;
            long j=x/2;
            long ans=0;
          while(i<=j)
          {
              long mid=i+(j-i)/2;
              if(mid*mid<x){
                  ans=mid;
                  i=mid+1;
              }else if(mid*mid>x){
                  j=mid-1;
              }else{
                  return mid;
              }
          }
          return ans;
	 }
}
