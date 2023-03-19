class Trie {
    TrieNode root;
    public Trie() {
      root=new TrieNode();
    }
    
    public void insert(String word) {
       
        in(root,word);
    }
    
    public boolean search(String word) {
      return  se(root,word);
    }
    
    public boolean startsWith(String prefix) {
       return sw(root,prefix);
    }
    public void in(TrieNode root,String s)
    {
       TrieNode curnode=root;
        for(int i=0;i<s.length();i++)
        {
            char cur=s.charAt(i);
            if(curnode.child[cur-'a']==null)
            {
                TrieNode newnode=new TrieNode();
                curnode.child[cur-'a']=newnode;
            }
            curnode=curnode.child[cur-'a'];
        }
        curnode.isLast=true;
    }
     public boolean se(TrieNode root,String s)
    {
       TrieNode curnode=root;
        for(int i=0;i<s.length();i++)
        {
            char cur=s.charAt(i);
            if(curnode.child[cur-'a']==null)return false;
           curnode=curnode.child[cur-'a'];
        }
       return curnode.isLast;
    }
    public boolean sw(TrieNode root,String s)
    {
       TrieNode curnode=root;
        for(int i=0;i<s.length();i++)
        {
            char cur=s.charAt(i);
            if(curnode.child[cur-'a']==null)return false;
           curnode=curnode.child[cur-'a'];
        }
       return true;
    }
}
class TrieNode{
    TrieNode[] child;
    boolean isLast;
    public TrieNode(){
        child=new TrieNode[26];
        isLast=false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */