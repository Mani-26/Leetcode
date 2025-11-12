class Solution {
    public int findPermutationDifference(String s, String t) {
        int res=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            res+=Math.abs(i-t.indexOf(s.charAt(i)));
        }
        return res;
    }
}