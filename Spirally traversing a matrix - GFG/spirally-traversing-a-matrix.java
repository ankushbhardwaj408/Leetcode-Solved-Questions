//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
       
        ArrayList<Integer> ans=new ArrayList<>();
        int rows=0;
        int rowe=matrix.length-1;
         int cols=0;
        int cole=matrix[0].length-1;
        while(rows<=rowe && cols<=cole)
        {
            for(int i=cols;i<=cole;i++)
            {
                ans.add(matrix[rows][i]);
            }
            rows++;
             for(int j=rows;j<=rowe;j++)
            {
                ans.add(matrix[j][cole]);
            }
            cole--;
            
            if(rows<=rowe){
             for(int k=cole;k>=cols;k--)
            {
                ans.add(matrix[rowe][k]);
            }
            }
            rowe--;
            if(cols<=cole)
            {
             for(int l=rowe;l>=rows;l--)
            {
                ans.add(matrix[l][cols]);
            }
            }
            cols++;
        }
        
        return ans;
    }
}
