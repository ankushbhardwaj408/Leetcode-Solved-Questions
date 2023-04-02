class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] pairs=new int[spells.length];
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++)
        {
            int s=0;
            int e=potions.length-1;
           
            int ans=0;
            while(s<=e)
            {
                 int mid=(s+e)/2;
                long target=(long)spells[i]*potions[mid];
                if(target>=success){
                
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }
            pairs[i]=potions.length-s;
        }
        return pairs;
    }
}