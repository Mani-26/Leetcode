class Solution {
    public String truncateSentence(String s, int k) {
        int n=s.length();
        int c=0;
        int i=0;
        for(i=0;i<n-1;i++){
            if(s.charAt(i)==' ') c++;
            if(c==k) break;
        }
        return (i==n-1)?s.substring(0,i+1):s.substring(0,i);
    }
}