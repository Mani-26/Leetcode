class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i = 0, j = 0;
        int l1 = str1.length();
        int l2 = str2.length();
        while (i < l1 && j < l2) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(j);
            if (ch1 == ch2) {
                i++;
                j++;
            } else {
                ch1 = (ch1 == 'z') ? 'a' : (char)(ch1 + 1);
                if (ch1 == ch2) {
                    i++;
                    j++;
                }else{
                    i++;
                }
            }
        }
        return j==l2;
    }
}