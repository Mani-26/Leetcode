class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord = false;
    int count = 0;
}
class Solution {
    TrieNode root;
    public Solution() {
        root = new TrieNode();
    }
    private void insert(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
            current.count++;
        }
        current.isEndOfWord = true;
    }

    private String findLongest(int totalWords) {
        StringBuilder out = new StringBuilder();
        TrieNode current = root;
        while (true) {
            int index = -1;
            for (int i = 0; i < 26; i++) {
                if (current.children[i] != null && current.children[i].count == totalWords) {
                    index = i;
                    break;
                }
            }
            if (index == -1) break;
            out.append((char) (index + 'a'));
            current = current.children[index];
        }
        return out.toString();
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (String word : strs) {
            insert(word);
        }
        return findLongest(strs.length);
    }
}