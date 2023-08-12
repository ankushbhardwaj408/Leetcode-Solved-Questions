class Solution {
    public boolean checkValid(int[][] matrix) {
        for(int i=0;i<matrix.length;i++)
        {
            HashSet<Integer> map=new HashSet<>();
            for(int j=0;j<matrix[0].length;j++)
            {
                map.add(matrix[i][j]);
            }
            if(map.size()!=matrix.length)return false;
            map.clear();
        }
         for(int i=0;i<matrix.length;i++)
        {
            HashSet<Integer> map=new HashSet<>();
            for(int j=0;j<matrix[0].length;j++)
            {
                map.add(matrix[j][i]);
            }
            if(map.size()!=matrix.length)return false;
            map.clear();
        }
        return true;
    }
}