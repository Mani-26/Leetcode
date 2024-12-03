class Solution {
    public boolean hasAlternatingBits(int n) {
        int pre=n&1;
        n>>=1;
        while(n>0){
            if(pre==(n&1)) return false;
            pre=n&1;
            n>>=1;
        }
        return true;
    }
}