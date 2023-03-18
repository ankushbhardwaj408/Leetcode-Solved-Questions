class BrowserHistory {
String homepage;
    List<String> lis=new ArrayList<>();
    int s=-1;
    int size=0;
    public BrowserHistory(String homepage) {
        this.homepage=homepage;
        lis.add(++s,homepage);
        size=s+1;
    }
    
    public void visit(String url) {
      lis.add(++s,url);
        size=s+1;
        
    }
    
    public String back(int steps) {
        String ans;
        if(s-steps>=0)
        {
             
            ans= lis.get(s-steps);
           s=s-steps;
        }else{
            ans=lis.get(0);
            s=0;
        }
        return ans;
        
    }
    
    public String forward(int steps) {
         String ans;
        if(s+steps<size)
        {
             
            ans= lis.get(s+steps);
           s=s+steps;
        }else{
            ans=lis.get(size-1);
            s=size-1;
        }
        return ans;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */