class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String res = "";
        int left = 0;
        int count = 0;
        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) == '1') {
                count++;
            }
            if (count == k) {
                while (s.charAt(left) == '0') {
                    left++;
                }
                int len = right - left + 1;
                if (res.isEmpty() || len < res.length()) {
                    res = s.substring(left, right + 1);
                } else if (len == res.length()) {
                    String curr = s.substring(left, right + 1);
                    if (curr.compareTo(res) < 0) {
                        res = curr;
                    }
                }
                left++;
                count--;
            }
        }
        return res;
    }
}