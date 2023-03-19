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
        return s(word, root, 0);
    }

        public boolean s(String word, T root, int index) {
            if (root == null) return false;

            T curnode = root;
            for (int i = index; i < word.length(); i++) {
                char cur = word.charAt(i);
                if (cur == '.') {
                    for (int j = 0; j < curnode.child.length; j++) {
                        if (s(word, curnode.child[j], i + 1)) {
                            return true;
                        }
                    }
                    return false;
                }
                if (curnode.child[cur - 'a'] == null) return false;
                curnode = curnode.child[cur - 'a'];
            }

            return curnode.isLast;
        }
    // public boolean s(String word, T node, int wordIdx) {
    //     if (node == null) return false;
    //     for (int i = wordIdx; i < word.length(); i++) {
    //         int idx = word.charAt(i) - 'a';
    //         if (idx == (-51)) {
    //             for (int j = 0; j < node.child.length; j++) {
    //                 if (s(word, node.child[j], i + 1)) {
    //                     return true;
    //                 }
    //             }
    //             return false;
    //         }
    //         if (node.child[idx] == null) return false;
    //         node = node.child[idx];
    //     }
    //     return node.isLast;
    // }
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
