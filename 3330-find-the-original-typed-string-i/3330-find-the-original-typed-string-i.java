class Solution {
    public int possibleStringCount(String word) {
        int answer = 1;
        int i = 0;
        while (i < word.length()) {
            int j = i;
            while (j < word.length() && word.charAt(j) == word.charAt(i)) {
                j++;
            }
            int groupLength = j - i;
            answer += groupLength-1;
            i = j;
        }
        return answer;
    }
}