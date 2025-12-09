class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> li = new ArrayList<>();
        build(li, 0, 0, new StringBuilder(), n);
        return li;
    }
    private void build(List<String> li, int open, int close, StringBuilder s, int n){
        if(s.length() == 2 * n){
            li.add(s.toString());
            return;
        }
        if(open < n){
            s.append("(");
            build(li, open + 1, close, s, n);
            s.deleteCharAt(s.length() - 1);
        }
        if(close < open){
            s.append(")");
            build(li, open, close + 1, s, n);
            s.deleteCharAt(s.length() - 1);
        }
    }
}