class Solution {
    public int reverseDegree(String s) {
        int res=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            res+=(26-(s.charAt(i)-'a'))*(i+1);
        }
        return res;
    }
}