class Solution {
    public int longestSubstring(String s, int k) {
        if (s.length() < k)
            return 0;
        Set<Character> uniqueChars = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            uniqueChars.add(s.charAt(i));
        }
        for (Character c : uniqueChars) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    count++;
                }
            }
            if (count < k) {
                int maxLen = 0;
                String[] parts = s.split(Character.toString(c));
                for (String part : parts) {
                    maxLen = Math.max(maxLen, longestSubstring(part, k));
                }
                return maxLen;
            }
        }
        return s.length();
    }
}