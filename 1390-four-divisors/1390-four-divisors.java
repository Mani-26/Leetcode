class Solution {
    private int divisor(int num) {
        int res = 0;
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count++;
                res += i;
                if (i * i != num) {
                    count++;
                    res += num / i;
                }
            }
            if (count > 4)
                break;
        }
        return (count == 4) ? res : 0;
    }

    public int sumFourDivisors(int[] nums) {
        int out = 0;
        for (int num : nums) {
            out += divisor(num);
        }
        return out;
    }
}