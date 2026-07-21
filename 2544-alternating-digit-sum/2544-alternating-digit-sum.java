class Solution {
    public int alternateDigitSum(int n) {
        int count = 1;
        int sum1 = 0, sum2 = 0;
        while (n > 0) {
            if (count % 2 == 0) {
                sum1 += n % 10;
            } else {
                sum2 += n % 10;
            }
            n /= 10;
            count++;
        }
        
        return (count%2==0)?sum2-sum1:sum1-sum2;
    }
}