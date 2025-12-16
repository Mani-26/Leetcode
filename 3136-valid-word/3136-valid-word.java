class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }
        int vol = 0, con = 0;
        for (int i = 0; i<word.length(); i++) {
            char ch = word.charAt(i);
            if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'))) {
                return false;
            }
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                vol++;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                con++;
            }
        }
        return vol > 0 && con > 0;
    }
}