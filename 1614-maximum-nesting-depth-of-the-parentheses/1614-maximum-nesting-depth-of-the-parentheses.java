class Solution {
    public int maxDepth(String s) {
        int curr=0;
        int max=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                curr++;
                max=Math.max(max,curr);
            }else if(s.charAt(i)==')'){
                curr--;
            }
        }
        return max;
    }
}