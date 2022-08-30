class Solution {
    public int maxProfit(int[] prices) {
   int[] aux=new int[prices.length];
        aux[aux.length-1]=prices[aux.length-1];
        for(int i=aux.length-2;i>=0;i--)
        {
            
            aux[i]=Math.max(prices[i],aux[i+1]);
        }
        int ans=0;
        for(int j=0;j<aux.length;j++)
        {
            ans=Math.max(ans,aux[j]-prices[j]);
        }
        return ans;
    }
}