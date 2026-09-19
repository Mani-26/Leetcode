class Solution {
    public String decodeMessage(String key, String message) {
        char[] map = new char[26];
        boolean[] seen = new boolean[26];

        int idx = 0;

        for (char ch : key.toCharArray()) {
            if (ch != ' ' && !seen[ch - 'a']) {
                seen[ch - 'a'] = true;
                map[ch - 'a'] = (char) ('a' + idx++);
            }
        }

        char res[] = message.toCharArray();
        for (int i = 0; i < res.length; i++) {
            if (res[i] == ' ')
                continue;
            res[i] = map[res[i] - 'a'];
        }

        return String.valueOf(res);
    }
}