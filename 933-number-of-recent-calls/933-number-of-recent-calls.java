class RecentCounter {
int[] data;
    int ptr=0;
    public RecentCounter() {
        this.data=new int[1000];
    }
    
    public int ping(int t) {
        if(ptr==data.length)
        {
            int[] temp=new int[data.length*2];
            for(int i=0;i<data.length;i++)
            {
                temp[i]=data[i];
            }
            data=temp;
        }
        data[ptr++]=t;
        int r1=t-3000;
        int r2=t;
        int c=0;
        for(int j=0;j<ptr;j++)
        {
            if(data[j]>=r1 && data[j]<=r2) c++;
        }
        return c;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */