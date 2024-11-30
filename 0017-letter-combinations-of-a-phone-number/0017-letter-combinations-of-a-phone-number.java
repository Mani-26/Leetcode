class Solution {
    List<String> li = new ArrayList<>();
    String arr[] = { " ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return li;
        }
        combine(0, digits, new StringBuilder());
        return li;
    }

    public void combine(int j, String digits, StringBuilder s) {
        if (s.length() == digits.length()) {
            li.add(s.toString());
            return;
        }
        String temp = arr[digits.charAt(j) - '0'];
        for (int i = 0; i < temp.length(); i++) {
            s.append(temp.charAt(i));
            combine(j + 1, digits, s);
            s.deleteCharAt(s.length() - 1);
        }
    }
}