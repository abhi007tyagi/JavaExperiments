package tyagiabhinav.leetcode;

class TrieNode {
    TrieNode[] child;
    boolean isEnd;

    TrieNode(){
        this.child = new TrieNode[26];
        this.isEnd = false;
    }
}

class Trie {
    TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode head = root;
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(head.child[ch-'a'] == null){
                head.child[ch-'a'] = new TrieNode();
            }
            head = head.child[ch-'a'];
        }
        head.isEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode head = root;
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(head.child[ch-'a'] == null){
                return false;
            }
            head = head.child[ch-'a'];
        }
        return head.isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode head = root;
        for(int i=0; i<prefix.length(); i++){
            char ch = prefix.charAt(i);
            if(head.child[ch-'a'] == null){
                return false;
            }
            head = head.child[ch-'a'];
        }
        return true;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app"));
        trie.insert("app");
        System.out.println(trie.search("app"));
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */