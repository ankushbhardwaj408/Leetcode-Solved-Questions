class MinStack {
Stack<Integer> st;
  ArrayList<Integer> list=new ArrayList<>();
    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        list.add(val);
      
    }
    
    public void pop() {
         list.remove(st.peek());
        st.pop();
       
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        Collections.sort(list);
        return list.get(0);
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