class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        s=s.toLowerCase();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)) sb.append(c);
        }
        return palindrome(sb.toString());
    }
    public boolean palindrome(String s){
        int n=s.length();
        int l=0,r=n-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}