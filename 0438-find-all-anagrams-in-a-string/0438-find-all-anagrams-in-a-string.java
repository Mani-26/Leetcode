class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> li=new LinkedList<>();
        if(s.length()<p.length()) return li;
        int n=s.length();
        int m=p.length();
        for(int i=0;i<=n-m;i++) if(isAnagram(s.substring(i,i+m),p)) li.add(i);
        return li;
    }
    public boolean isAnagram(String s, String t) {
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        for(char c:s.toCharArray()) arr1[c-'a']++;
        for(char c:t.toCharArray()) arr2[c-'a']++;
        for(int i=0;i<26;i++) if(arr1[i]!=arr2[i]) return false;
        return true;
    }
}