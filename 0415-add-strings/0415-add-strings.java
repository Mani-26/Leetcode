class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder s = new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int val=0;
        while(i>=0 || j>=0 || val==1){
            if(i>=0) val+=num1.charAt(i--)-'0';
            if(j>=0) val+=num2.charAt(j--)-'0';
            s.append(val%10);
            val/=10;
        }
        return s.reverse().toString();
    }
}