class MyQueue {
int[] data;
    int front=0;
    int end=0;
    int size=0;
    
    public MyQueue() {
        this.data=new int[10];
    }
    
    public void push(int x) {
          if(size==data.length)
        {
            int[] temp=new int[data.length*2];
          for(int i=0;i<data.length;i++)
          {
              temp[i]=data[(front+i)%data.length];

          }
          front=0;
          end=data.length;
          data=temp;
        }
         data[end++]=x;
        end%=data.length;
        size++;
       
    }
    
    public int pop() {
        //  if(isEmpty()) {
        //     throw new Exception("stack is empty");
        // }
        int removed=data[front++];
        front%=data.length;
        size--;
        return removed; 
    }
    
    public int peek() {
        return data[front];
    }
    
    public boolean empty() {
        return (size==0);
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */