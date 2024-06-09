public class LC208 {

    TrieNode root;

    public LC208 () {
        root = null;
    }
    
    public void insert(String word) {
        if(root == null){
            root = new TrieNode();
        }
        
        insertWord(root,word);
        
    }
    
    private void insertWord(TrieNode root, String word) {
        TrieNode cur = root;
        for (int i = 0; i < word.length(); i++) {
            if(cur.getTrieNode(word.charAt(i)) == null){
                cur.alphabets[word.charAt(i) - 'a'] = new TrieNode();
                cur.setData(word.charAt(i));
            }
            cur = cur.getTrieNode(word.charAt(i));
        }
        cur.setEndOfWord();
    }

    public boolean search(String word) {
        TrieNode cur = root;
        for (int i = 0; i < word.length(); i++) {
            if(cur.alphabets[word.charAt(i) - 'a'] == null){
                return false;
            }
            cur = cur.getTrieNode(word.charAt(i));
        }
        return cur.getEndOfWord();
    }
    
    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        for (int i = 0; i < prefix.length(); i++) {
            if(cur.alphabets[prefix.charAt(i) - 'a'] == null){
                return false;
            }
            cur = cur.getTrieNode(prefix.charAt(i));
        }
        return true;
    }
    
    public static void main(String[] args) {

        LC208 trie = new LC208();
        trie.insert("apple");
        System.out.println(trie.search("apple"));   // returns true
        System.out.println(trie.search("app"));     // returns false
        System.out.println(trie.startsWith("app")); // returns true
        trie.insert("app");
        System.out.println(trie.search("app"));     // returns true
    }
}

class TrieNode{
    TrieNode[] alphabets;
    char data;
    boolean endOfWord;
    public TrieNode() {
        alphabets = new TrieNode[25];
        data = ' ';
    }

    public TrieNode getTrieNode(char c){
        return alphabets[c - 'a'];
    }

    public char getData(TrieNode root){
        return root.data;
    }
    public void setData(char c){
        data = c;
    }
    public void setEndOfWord(){
        endOfWord = true;
    }
    public boolean getEndOfWord(){
        return endOfWord;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */


