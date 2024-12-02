class Solution {
    public int numWaterBottles(int b, int e) {
        int n=b;
        while(b>=e){
            n+=b/e;
            b=(b/e)+(b%e);
        }
        return n;
    }
}