class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        char arr[][] = new char[numRows][s.length() / 2 + 1];
        StringBuilder sb = new StringBuilder();
        for (int i = 0, j = 0, k = 0; k < s.length();) {
            while (i < numRows && k < s.length()) {
                arr[i++][j] = s.charAt(k++);
            }
            --i;
            while (i > 0 && k < s.length()) {
                arr[--i][++j] = s.charAt(k++);
            }
            ++i;
            // }
        }
        for (char[] c : arr) {
            for (char ch : c) {
                if (ch != '\u0000')
                    sb.append(ch);
            }
        }
        System.out.println(sb);
        return sb.toString();
    }
}