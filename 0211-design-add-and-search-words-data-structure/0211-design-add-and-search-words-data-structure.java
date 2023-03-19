class WordDictionary {
    T root = new T();

    public WordDictionary() {}

    public void addWord(String word) {
        T curnode = root;
        for (int i = 0; i < word.length(); i++) {
            char cur = word.charAt(i);
            if (curnode.child[cur - 'a'] == null) {
                T newnode = new T();
                curnode.child[cur - 'a'] = newnode;
                
            }
            curnode = curnode.child[cur - 'a'];
        }
        curnode.isLast = true;
    }

    public boolean search(String word) {
      
        return searching(word, root, 0);
    }

//     public boolean s(String word, T root, int index) {
//         if(root==null)return false;
      
//         T curnode = root;
//         for (int i = index; i < word.length(); i++) {
//             char cur = word.charAt(i);
//             if (cur == '.') {
             
//                 for (int j = 0; j < curnode.child.length; j++) {
                   
                     
//                         if (s(word, curnode.child[j], index + 1)) {
//                             return true;
//                         }
                       
                    
                
//                 }
//                 return false;
//             } else {
//                 if (curnode.child[cur - 'a'] == null) return false;
//                 curnode = curnode.child[cur - 'a'];
//             }
//         }

//         return curnode.isLast;
//     }
    public boolean searching(String word, T node, int wordIdx) {
    if (node == null) return false;
    /**
     * Time Complexity: O(n)
     *   - word length
     */
    for (int i = wordIdx; i < word.length(); i++) {
      int idx = word.charAt(i) - 'a';
      // ('.' - 'a') = -51
      if (idx == (-51)) {
        /**
         * Time Complexity: O(1)
         *   - Always 26 lower-case English letters
         */
        for (int j = 0; j < node.child.length; j++) {
          /**
           * Space Complexity: O(n)
           *   - stack: if search '.' for whole letters.
           */
          if (searching(word, node.child[j], i + 1)) {
            return true;
          }
        }
        return false;
      }
      if (node.child[idx] == null) return false;
      node = node.child[idx];
    }
    return node.isLast;
  }
}

class T {
    T[] child;
    boolean isLast;

    public T() {
        child = new T[26];
        isLast = false;
      
    }
}
/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */