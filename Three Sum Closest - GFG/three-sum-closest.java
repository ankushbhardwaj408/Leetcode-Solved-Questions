//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int target = sc.nextInt();
        	int[] array = new int[n];
        	for(int i=0; i<n; i++)
        		array[i] = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.threeSumClosest(array,target));
            t--;
        }
    } 
} 

// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static int threeSumClosest(int[] nums, int target)  
	{ 
        int ans1=Integer.MAX_VALUE;
        int ans2=Integer.MIN_VALUE;
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-2;i++)
        {
         
            int left=i+1;
            int right=n-1;
            while(left<right)
            {
                int sum=nums[i];
                sum=sum+nums[left];
                sum=sum+nums[right];
                if(sum>target)
                {
                    ans1=Math.min(ans1,sum);
                    right--;
                }else if(sum<target)
                {
                     ans2=Math.max(ans2,sum);
                    left++;
                }else{
                   return target;
                }
              
            }
        
        }
    
     if(ans1==Integer.MAX_VALUE){
         return ans2;
     }
     if(ans2==Integer.MIN_VALUE){
         return ans2;
     }
     int x=Math.abs(target-ans1);
     int y=Math.abs(target-ans2);
     if(x==y) return Math.max(ans1,ans2);
     if(x<y)
     {
         return ans1;
     }
     return ans2;
     
      
	} 
} 
