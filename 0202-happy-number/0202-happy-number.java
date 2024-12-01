class Solution {
    public boolean isHappy(int n) {
        Set<Integer> hs = new HashSet<>();
        while (n != 1 && !hs.contains(n)) {
            hs.add(n);
            n = helper(n);
        }
        return n == 1;
    }
    public int helper(int n) {
        int out = 0;
        while (n > 0) {
            int temp = n % 10;
            out += temp * temp;
            n /= 10;
        }
        return out;
    }
}