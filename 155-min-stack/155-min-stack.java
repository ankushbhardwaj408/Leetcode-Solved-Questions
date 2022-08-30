class MinStack {
int[] data;
    int dsize=10;
     int ptr=-1;
    public MinStack() {
        this.data=new int[1000];
      
    }
    
    public void push(int val) {
        if(ptr==data.length-1){
            int[] temp=new int[data.length*2];
            for(int i=0;i<data.length;i++)
            {
                temp[i]=data[i];
            }
            data=temp;
        }
        data[++ptr]=val;
        
        
    }
    
    public void pop() {
        ptr--;
    }
    
    public int top() {
        return data[ptr];
    }
    
    public int getMin() {
        int min=Integer.MAX_VALUE;
     for(int i=0;i<=ptr;i++)
     {
         min=Math.min(min,data[i]);
     }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */