class Solution {
    public int largestInteger(int n, int s) {
        if (s > (n * 9))
            return -1;
        if (s == 0)
            return 0;
        int res = 0;
        int c = 0;
        while (c != n) {
            if (s >= 9) {
                res = (res * 10) + 9;
                s -= 9;
            } else if (s > 0) {
                res = (res * 10) + s;
                s = 0;
            } else
                res *= 10;
            c++;
        }
        return res;
    }
}