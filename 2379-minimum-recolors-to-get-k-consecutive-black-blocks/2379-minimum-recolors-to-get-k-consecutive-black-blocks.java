class Solution {
    public int minimumRecolors(String blocks, int k) {
         for(int i=0;i<blocks.length();i++)
         { int s=0;
             for(int j=i;j<blocks.length();j++)
             {
                 if(blocks.charAt(j)=='W') break;
                 if(blocks.charAt(j)=='B') s++;
                 if(s>=k) return 0;
                 
             }
         }
        
        int ans=Integer.MAX_VALUE;
        for(int p=0;p<blocks.length();p++)
        { int c=0;
         int o=0;
            for(int h=p;h<blocks.length();h++)
            {
                                if(blocks.charAt(h)=='W'){
                                    c++;
                                }
                o++;
                if(o==k){
                   ans=Math.min(c,ans) ;
                }
                
            }
        }
        return ans;
    }
}