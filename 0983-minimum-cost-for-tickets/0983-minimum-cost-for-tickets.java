class Solution {
    Integer[] arr;
    public int mincostTickets(int[] days, int[] costs) {
        arr=new Integer[days.length];
        return fun(days,costs,0);
    }
    public int fun(int[] days, int[] costs,int d){
        if(d>=days.length)return 0;
        if(arr[d]!=null){
            return arr[d];
        }
        int one=fun(days,costs,d+1)+costs[0];
        int i;
        for(i=d;i<days.length;i++)
        {
            if(days[i]>=days[d]+7)break;
        }
        int two=fun(days,costs,i)+costs[1];
         for(i=d;i<days.length;i++)
        {
            if(days[i]>=days[d]+30)break;
        }
        int three=fun(days,costs,i)+costs[2];
        return arr[d]= Math.min(one,Math.min(two,three));
    }
}