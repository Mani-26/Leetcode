class Solution {
    HashSet<String> hs = new HashSet<>();
    int n;
    int digits[];

    public int totalNumbers(int[] digits) {
        n = digits.length;
        this.digits = digits;
        boolean[] flag=new boolean[n];
        for (int i = 0; i < n; i++) {
            if (digits[i] == 0)
                continue;
            flag[i]=true;
            make3Digit("" + digits[i], i,flag);
            flag[i]=false;
        }
        return hs.size();
    }

    void make3Digit(String s, int i,boolean[] flag) {
        if (s.length() == 3) {
            // System.out.println(s);
            if ((s.charAt(2) - '0') % 2 == 0)
                hs.add(s);
            return;
        }
        for (int j = 0; j < n; j++) {
            if (flag[j])
                continue;
            flag[j]=true;
            make3Digit(s + digits[j], j,flag);
            flag[j]=false;
        }
    }
}
