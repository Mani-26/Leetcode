class Solution {
    public boolean canConstruct(String s, int k) {
        int n=s.length();
        if(k>n) return false;
        if(k==n) return true;
        int freq[]=new int[26];
        int oddCount=0;
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (int count : freq) {
            if (count % 2 == 1) {
               oddCount++;
            }
        }
        if(oddCount>k) return false;
        return true;
    }
}