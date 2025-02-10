class Solution {
    public String clearDigits(String s) {
        Stack<Character> stk=new Stack<>();
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if (Character.isDigit(ch)) {
                if (!stk.isEmpty()) {
                    stk.pop(); 
                }
            } else {
                stk.push(ch);
            }
        }
        while (!stk.isEmpty()) {
            sb.append(stk.pop());
        }
        return sb.reverse().toString();
    }
}