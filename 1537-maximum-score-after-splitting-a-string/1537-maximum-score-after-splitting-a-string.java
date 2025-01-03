class Solution {
    public int maxScore(String s) {
        int one = 0;
        int zero = 0;
        int max = Integer.MIN_VALUE;
        int n = s.length();
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == '1') {
                one++;
            } else {
                zero++;
            }
            max = Math.max(max, zero - one);
        }
        if (s.charAt(s.length() - 1) == '1') {
            one++;
        }
        return max + one;
    }
}