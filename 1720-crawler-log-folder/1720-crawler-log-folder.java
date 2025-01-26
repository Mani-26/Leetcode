class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stk=new Stack<>();
        for(String log:logs){
            if(log.charAt(1)=='.'){
                if(stk.isEmpty()) continue;
                else stk.pop();
            }else if(log.equals("./")) continue;
            else stk.push(log);
        }
        return stk.size();
    }
}