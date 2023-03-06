class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int x:arr)
        {
            list.add(x);
        }
        int j=0;
        while(k!=0)
        {
            if(!list.contains(j+1))k--;
            j++;
        }
        return j;
    }
}