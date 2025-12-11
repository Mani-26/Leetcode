class Solution {
    public boolean wordPattern(String pattern, String str) {
        char s[] = pattern.toCharArray();
        String words[] = str.split(" ");
        if (s.length != words.length)
            return false;
        Map<Character, String> hm1 = new HashMap<>();
        Map<String, Character> hm2 = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            if (hm1.containsKey(s[i]) && !hm1.get(s[i]).equals(words[i]))
                return false;
            else if(!hm1.containsKey(s[i]))
                hm1.put(s[i], words[i]);
            if (hm2.containsKey(words[i]) && hm2.get(words[i]) != s[i])
                return false;
            else if(!hm2.containsKey(words[i]))
                hm2.put(words[i], s[i]);
        }
        return true;
    }
}