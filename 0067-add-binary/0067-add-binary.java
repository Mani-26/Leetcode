// import java.util.Stack;
class Solution {
    public String addBinary(String a, String b) {
        // Stack<Character> s = new Stack<>();
        StringBuilder s = new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int val=0;
        // String out="";
        while(i>=0 || j>=0|| val==1){
            if(i>=0) val+=a.charAt(i--)-'0';
            if(j>=0) val+=b.charAt(j--)-'0';
            s.append(val%2);
            val/=2;
        }
        // while(!s.isEmpty()) out+=s.pop();
        return s.reverse().toString();
    }
}