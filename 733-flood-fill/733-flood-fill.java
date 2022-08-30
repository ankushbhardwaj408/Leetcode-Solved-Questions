class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       if(image[sr][sc]==color) return image;
       int oldcolor=image[sr][sc];
        Fill(image,oldcolor,sr,sc,color);
        return image;
    }
     public void Fill(int[][] image,int oldcolor, int sr, int sc, int color) {
       
      
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length) return;
           if(image[sr][sc]!=oldcolor) return;
      image[sr][sc]=color;
      Fill(image,oldcolor,sr+1,sc,color);
         Fill(image,oldcolor,sr,sc+1,color);
         Fill(image,oldcolor,sr-1,sc,color);
       Fill(image,oldcolor,sr,sc-1,color);
          
       
    }
}