class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;
        int val = 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                val += i;
                if (i != num / i) { 
                    val += num / i;
                }
            }
        }
        return val == num;
    }
}
