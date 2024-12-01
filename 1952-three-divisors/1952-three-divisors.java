class Solution {
    public boolean isThree(int n) {
        int fac = 1;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0)
                fac++;
            if (fac > 3)
                return false;
        }
        return fac == 3;
    }
}