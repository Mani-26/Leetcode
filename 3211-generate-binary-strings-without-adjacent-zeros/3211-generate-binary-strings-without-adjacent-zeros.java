class Solution {
    List<String> li;

    private void binString(String str, int n) {
        if (str.length() == n) {
            li.add(str);
            return;
        }
        if (str.length() != 0 && str.charAt(str.length() - 1) == '0') {
            binString(str + '1', n);
        } else {
            binString(str + '0', n);
            binString(str + '1', n);
        }
    }

    public List<String> validStrings(int n) {
        li = new ArrayList<>();
        binString("", n);
        return li;
    }
}