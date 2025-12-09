class Solution {
    public String reverseOnlyLetters(String s) {
        char str[] = s.toCharArray();
        int i = 0;
        int j = str.length - 1;
        while (i < j) {
            if (!Character.isLetter(str[i]) && i < j) {
                i++;
            }
            else if (!Character.isLetter(str[j]) && i < j) {
                j--;
            }
            else{
                char ch = str[i];
                str[i] = str[j];
                str[j] = ch;
                i++;
                j--;
            }
        }
        return new String(str);
    }
}