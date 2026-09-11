class Solution {
    int n;
    int digits[];
    int count = 0;

    public int totalNumbers(int[] digits) {
        count = 0;
        n = digits.length;
        this.digits = digits;
        boolean[] flag = new boolean[n];
        boolean[] used = new boolean[10];
        for (int i = 0; i < n; i++) {
            if (digits[i] == 0 || used[digits[i]])
                continue;
            used[digits[i]] = true;
            flag[i] = true;
            make3Digit(digits[i], flag);
            flag[i] = false;
        }
        return count;
    }

    void make3Digit(int num, boolean[] flag) {
        if (num >= 100) {
            if (num % 2 == 0)
                count++;
            return;
        }
        boolean[] used = new boolean[10];
        for (int j = 0; j < n; j++) {
            if (flag[j] || used[digits[j]])
                continue;
            used[digits[j]] = true;
            flag[j] = true;
            make3Digit(num * 10 + digits[j], flag);
            flag[j] = false;
        }
    }
}
