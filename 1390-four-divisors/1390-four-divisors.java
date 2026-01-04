class Solution {
    private int divisor(int num) {
        int res = num + 1;
        int count = 2;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                res += i;
            }
            if (count > 4)
                return 0;
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