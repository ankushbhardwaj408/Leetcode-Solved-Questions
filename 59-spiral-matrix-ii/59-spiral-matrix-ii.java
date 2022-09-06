class Solution {
    public int[][] generateMatrix(int n) {
         int[][] matrix=new int[n][n];
        int q=1;
        int rows=0;
        int rowe=matrix.length-1;
         int cols=0;
        int cole=matrix[0].length-1;
        while(rows<=rowe && cols<=cole)
        {
            for(int i=cols;i<=cole;i++)
            {
                matrix[rows][i]=q++;
            }
            rows++;
             for(int j=rows;j<=rowe;j++)
            {
                matrix[j][cole]=q++;
            }
            cole--;
            
            if(rows<=rowe){
             for(int k=cole;k>=cols;k--)
            {
                matrix[rowe][k]=q++;
            }
            }
            rowe--;
            if(cols<=cole)
            {
             for(int l=rowe;l>=rows;l--)
            {
                matrix[l][cols]=q++;
            }
            }
            cols++;
        }
        
        return matrix;
    }
}