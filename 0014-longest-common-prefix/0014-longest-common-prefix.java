class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        // String prefix = strs[0];
        for (String s : strs)
            while (s.indexOf(strs[0]) != 0)
                strs[0] = strs[0].substring(0, strs[0].length() - 1);
        return strs[0];
    }
}