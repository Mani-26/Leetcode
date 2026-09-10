class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        int n = command.length();
        for (int i = 0; i < n; i++) {
            if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    sb.append('o');
                    i += 1;
                } else {
                    sb.append("al");
                    i += 3;
                }
            } else {
                sb.append('G');
            }
        }
        return sb.toString();
    }
}