class Solution {
    public boolean canBeValid(String s, String locked) {
        int n=s.length();
        if(n%2==1){
            return false;
        }
        int wild=0,open=0,close=0;
        for(int i=0;i<n;i++){
            if(locked.charAt(i)=='0'){
                wild++;
            }
            else if(s.charAt(i)=='('){
                open++;
            }
            else{
                close++;
            }
            if(wild+open<close){
                return false;
            }
        }
        wild=open=close=0;
        for(int i=n-1;i>=0;i--){
            if(locked.charAt(i)=='0'){
                wild++;
            }
            else if(s.charAt(i)=='('){
                open++;
            }
            else{
                close++;
            }
            if(wild+close<open){
                return false;
            }
        }
        return true;
    }
}