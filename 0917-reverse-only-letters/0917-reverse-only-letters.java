class Solution {
    public String reverseOnlyLetters(String s) {
        char str[] = s.toCharArray();
        int i = 0;
        int j = str.length - 1;
        while (i < j) {
            while (!Character.isLetter(str[i])&&i<j) {
                i++;
            }
            while (!Character.isLetter(str[j])&&i<j) {
                j--;
            }
            char ch = str[i];
            str[i] = str[j];
            str[j] = ch;
            i++;
            j--;
        }
        return new String(str);
    }
}