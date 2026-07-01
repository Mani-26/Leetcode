class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Arrays.sort(strs);
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (String s : strs)
            while (s.indexOf(prefix) != 0)
                prefix = prefix.substring(0, prefix.length() - 1);
        return prefix;
    }
}