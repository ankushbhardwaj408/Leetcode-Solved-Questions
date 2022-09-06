class Solution {
    public void setZeroes(int[][] matrix) {
        zero(matrix,0,0);
    }
    public void zero(int[][] matrix,int r,int c){
        // if(r==matrix.length)
        // {
        //     return ;
        // }
        if(c==matrix[0].length)
        {
            zero(matrix,r+1,0);
        }
         if(r==matrix.length || c==matrix[0].length)
        {
            return;
        }
        if(matrix[r][c]==0)
        {
            zero(matrix,r,c+1);
            make(matrix,r,c);
        }else{
            zero(matrix,r,c+1);
        }
    }
    public void make(int[][] matrix,int r,int c)
    {
        for(int i=0;i<matrix.length;i++)
        {
            matrix[i][c]=0;
        }
         for(int j=0;j<matrix[0].length;j++)
        {
            matrix[r][j]=0;
        }
        
    }
}