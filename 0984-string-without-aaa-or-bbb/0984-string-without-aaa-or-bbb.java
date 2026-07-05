class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuilder sb = new StringBuilder();
        while (a > 0 || b > 0) {
            int len = sb.length();
            boolean useA = false;
            if (len >= 2 && sb.charAt(len - 1) == sb.charAt(len - 2))
                useA = sb.charAt(len - 1) == 'b';
            else if (a >= b)
                useA = true;

            if (useA) {
                sb.append('a');
                a--;
            } else {
                sb.append('b');
                b--;
            }
        }
        return sb.toString();
    }
}