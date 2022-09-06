class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
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