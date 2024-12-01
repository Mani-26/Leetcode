class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder val=new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            val.append((char)(columnNumber%26+'A'));
            columnNumber/=26;
        }
        return val.reverse().toString();
    }
}