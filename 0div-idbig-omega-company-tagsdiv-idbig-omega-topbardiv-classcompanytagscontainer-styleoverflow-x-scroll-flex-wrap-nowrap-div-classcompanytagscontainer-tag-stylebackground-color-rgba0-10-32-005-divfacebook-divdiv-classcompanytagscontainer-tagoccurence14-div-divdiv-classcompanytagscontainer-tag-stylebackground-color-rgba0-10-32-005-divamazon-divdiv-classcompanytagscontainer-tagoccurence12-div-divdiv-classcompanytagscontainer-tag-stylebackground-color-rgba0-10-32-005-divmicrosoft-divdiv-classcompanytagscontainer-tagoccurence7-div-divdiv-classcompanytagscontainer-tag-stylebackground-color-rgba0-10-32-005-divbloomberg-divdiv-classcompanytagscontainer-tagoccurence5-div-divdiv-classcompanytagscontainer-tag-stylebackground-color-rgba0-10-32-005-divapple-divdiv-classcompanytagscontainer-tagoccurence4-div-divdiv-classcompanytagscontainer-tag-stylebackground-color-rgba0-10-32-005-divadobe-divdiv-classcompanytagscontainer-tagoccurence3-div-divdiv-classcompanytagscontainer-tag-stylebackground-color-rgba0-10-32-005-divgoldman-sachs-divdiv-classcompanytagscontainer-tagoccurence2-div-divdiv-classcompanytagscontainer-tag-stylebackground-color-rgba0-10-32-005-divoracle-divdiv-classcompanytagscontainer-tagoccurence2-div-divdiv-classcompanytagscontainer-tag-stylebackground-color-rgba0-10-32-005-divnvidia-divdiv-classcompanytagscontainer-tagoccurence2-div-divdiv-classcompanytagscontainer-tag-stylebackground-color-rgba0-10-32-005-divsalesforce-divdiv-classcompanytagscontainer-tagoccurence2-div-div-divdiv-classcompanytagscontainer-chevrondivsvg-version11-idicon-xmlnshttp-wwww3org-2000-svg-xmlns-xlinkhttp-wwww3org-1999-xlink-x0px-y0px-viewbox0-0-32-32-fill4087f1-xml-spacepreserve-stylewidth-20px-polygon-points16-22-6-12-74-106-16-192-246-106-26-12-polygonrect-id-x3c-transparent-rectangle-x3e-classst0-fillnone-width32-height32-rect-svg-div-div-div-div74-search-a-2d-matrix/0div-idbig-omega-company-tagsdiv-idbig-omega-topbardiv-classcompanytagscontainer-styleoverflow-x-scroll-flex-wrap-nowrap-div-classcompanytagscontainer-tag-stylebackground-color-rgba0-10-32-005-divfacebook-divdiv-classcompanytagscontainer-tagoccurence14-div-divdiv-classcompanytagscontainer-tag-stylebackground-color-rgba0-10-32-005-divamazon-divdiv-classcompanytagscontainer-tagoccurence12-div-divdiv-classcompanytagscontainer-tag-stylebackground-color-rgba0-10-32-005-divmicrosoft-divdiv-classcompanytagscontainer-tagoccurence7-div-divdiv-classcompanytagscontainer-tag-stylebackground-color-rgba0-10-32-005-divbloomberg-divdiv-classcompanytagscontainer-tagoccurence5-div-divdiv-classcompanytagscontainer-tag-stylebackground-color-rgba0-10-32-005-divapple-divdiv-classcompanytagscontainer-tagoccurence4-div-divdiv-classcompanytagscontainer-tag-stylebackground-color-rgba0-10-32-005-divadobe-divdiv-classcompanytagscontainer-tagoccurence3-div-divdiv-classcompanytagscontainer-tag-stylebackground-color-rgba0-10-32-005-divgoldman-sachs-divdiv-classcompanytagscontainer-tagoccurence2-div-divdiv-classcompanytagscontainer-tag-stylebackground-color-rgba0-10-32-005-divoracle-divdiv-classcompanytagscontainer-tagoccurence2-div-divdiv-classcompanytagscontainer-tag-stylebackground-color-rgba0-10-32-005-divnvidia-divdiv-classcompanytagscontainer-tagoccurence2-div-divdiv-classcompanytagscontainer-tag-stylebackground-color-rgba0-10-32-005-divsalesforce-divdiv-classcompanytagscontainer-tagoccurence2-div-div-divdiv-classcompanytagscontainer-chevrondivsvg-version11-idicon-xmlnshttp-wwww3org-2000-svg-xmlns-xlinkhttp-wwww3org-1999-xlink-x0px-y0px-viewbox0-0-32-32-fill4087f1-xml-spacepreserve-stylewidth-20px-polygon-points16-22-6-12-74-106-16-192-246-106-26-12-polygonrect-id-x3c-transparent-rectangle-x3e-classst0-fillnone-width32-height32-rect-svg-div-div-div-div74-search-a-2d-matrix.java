class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int i=0;
        int j=matrix.length;
        while(i<j)
        {
            int mid=(i+j)/2;
            if(matrix[mid][n-1]==target)return true;
            if(matrix[mid][n-1]<target){
                i=mid+1;
            }else{
                j=mid;
            }
        }
        if(j==m)return false;
        int a=0;
        int b=n;
        while(a<b)
        {
            int mid=(a+b)/2;
            if(matrix[j][mid]==target)return true;
             if(matrix[j][mid]<target){
                a=mid+1;
            }else{
                b=mid;
            }
        }
        return false;
    }
}