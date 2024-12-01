class TrieNode{
    TrieNode child[]=new TrieNode[26];
    boolean end=false;
}
class Trie{
    TrieNode root;
    public Trie(){
        root=new TrieNode();
    }
    void insert(String word){
        TrieNode current=root;
        for(int i=0;i<word.length();i++){
            int index=word.charAt(i)-'a';
            if(current.child[index]==null){
                current.child[index]=new TrieNode();
            }
            current=current.child[index];
        }
        current.end=true;
    }
    boolean search(String word,int s,int e){
        TrieNode current =root;
        for(int i=s;i<e;i++){
            int index=word.charAt(i)-'a';
            if(current.child[index]==null){
                return false;
            }
            current=current.child[index];
        }
        return current.end;
    }
}
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Trie t=new Trie(); 
        int n=s.length();
        for(String str:wordDict){
            t.insert(str);
        }
        boolean dp[]=new boolean[n+1];
        dp[0]=true;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                if(dp[j]&&t.search(s,j,i)){
                    dp[i]=true;
                    break;
                }   
            }
        }
        return dp[n];
    }
}