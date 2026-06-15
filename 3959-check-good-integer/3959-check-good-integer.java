class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum=0;
        int squareSum=0;
        while(n!=0){
            int t=n%10;
            digitSum+=t;
            squareSum+=(t*t);
            n/=10;
        }
        return squareSum-digitSum>=50;
    }
}