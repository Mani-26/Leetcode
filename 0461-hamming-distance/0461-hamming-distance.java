class Solution {
    public int hammingDistance(int x, int y) {
        int n=x^y;
        int res=0;
        while(n>0){
            res+=(n&1);
            n>>=1;
        }
        return res;
    }
}