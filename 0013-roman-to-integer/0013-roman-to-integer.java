class Solution {
    public int romanToInt(String s) {
        int out = 0, temp = 0,prev=0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    temp = 1;
                    break;
                case 'V':
                    temp = 5;
                    break;
                case 'X':
                    temp = 10;
                    break;
                case 'L':
                    temp = 50;
                    break;
                case 'C':
                    temp = 100;
                    break;
                case 'D':
                    temp = 500;
                    break;
                case 'M':
                    temp = 1000;
                    break;
            }
            if (temp < prev)
                out -= temp;
            else
                out += temp;
            prev=temp;
        }
        return out;
    }
}