class Solution {
    public int balancedStringSplit(String s) {
        int right=0;
        int left=0;
        int count=0;
        int n=s.length();
        while(--n>=0){
            if(s.charAt(n)=='R'){
                right++;
            }else {
                left++;
            }
            if(right==left){
                right=left=0;
                count++;
            }
        }
        return count;
    }
}