class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int n = words.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String s1 = words[i];
                String s2 = words[j];
                int n1 = s1.length();
                int n2 = s2.length();
                if (n1 > n2)
                    continue;
                else {
                    boolean flag = true;
                    for (int k = 0; k < n1; k++) {
                        if (s1.charAt(k) != s2.charAt(k) || s1.charAt(k) != s2.charAt(n2 - n1 + k)) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}