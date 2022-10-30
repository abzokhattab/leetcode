class Trie {
    HashMap<Character, Trie> children;
    boolean isEndOfWord;

    public Trie() {
        isEndOfWord = false;
        children = new HashMap<Character, Trie>();
    }

    public void insert(String word) {
        Trie cur = this;
        for (char c : word.toCharArray()) {
            if (cur.children.containsKey(c)) {
                cur = cur.children.get(c);
            } else {
                Trie newNode = new Trie();
                cur.children.put(c, newNode);
                cur = newNode;
            }
        }
        cur.isEndOfWord = true;
    }

    public boolean search(String word) {
        Trie cur = this;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (cur.children.containsKey(c)) {
                cur = cur.children.get(c);
                if (i == word.length() - 1) {
                    return (cur.isEndOfWord);
                }
            } else return false;
        }
        return false;
    }

    public boolean startsWith(String word) {
        Trie cur = this;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (cur.children.containsKey(c)) {
                cur = cur.children.get(c);
            } else return false;
        }
        return true;
    }
}
/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
