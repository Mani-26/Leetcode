class Solution {
    public int myAtoi(String s) {
        boolean flag = false;
        s = s.trim();
        if (s.length() == 0)
            return 0;
        int i = 0;
        int num = 0;
        // System.out.println(Integer.MAX_VALUE+" "+Integer.MIN_VALUE);
        if (s.charAt(0) == '-') {
            i = 1;
            flag = true;
        }
        if (s.charAt(0) == '+') {
            i++;
        }
        for (; i < s.length(); i++) {
            System.out.println(num);
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                if (num > Integer.MAX_VALUE / 10 || (num >= Integer.MAX_VALUE / 10 && (s.charAt(i) - '0') > 7)) {
                    return flag?Integer.MIN_VALUE:Integer.MAX_VALUE;
                }
                num = (num * 10) + (s.charAt(i) - '0');
            } else {
                break;
            }
        }
        return flag? -num:num;
    }
}