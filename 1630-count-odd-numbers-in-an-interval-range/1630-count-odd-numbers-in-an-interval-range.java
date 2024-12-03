class Solution {
    public int countOdds(int low, int high) {
        int val = high - low + 1;
        return val % 2 == 0 ? val / 2 : high % 2 == 0 ? val / 2 : val / 2 + 1;
    }
}