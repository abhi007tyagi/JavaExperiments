package tyagiabhinav;

import java.util.HashMap;
import java.util.Map;

class TrieNode {
    HashMap<Character, TrieNode> children;
    int childCount;
    boolean isEnd;

    TrieNode(){
        children = new HashMap<>();
        isEnd = false;
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
        for(int i=0 ; i<word.length(); i++){
            if(!head.children.containsKey(word.charAt(i))){
                head.children.put(word.charAt(i), new TrieNode());
                head.childCount = head.childCount+1;
            }
            head = head.children.get(word.charAt(i));
        }
        head.isEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode head = root;
        for(int i=0 ; i<word.length(); i++){
            if(head.children.containsKey(word.charAt(i))){
                return false;
            }
            head = head.children.get(word.charAt(i));
        }
        return head.isEnd;
    }
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode head = root;
        for(int i=0 ; i<prefix.length(); i++){
            if(head.children.containsKey(prefix.charAt(i))){
                return false;
            }
            head = head.children.get(prefix.charAt(i));
        }
        return true;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("maple");
        trie.insert("application");
        trie.insert("app");
        trie.insert("chapel");
        trie.insert("chap");
        System.out.println(trie.search("apple"));
        System.out.println(trie.startsWith("app"));
    }
}
