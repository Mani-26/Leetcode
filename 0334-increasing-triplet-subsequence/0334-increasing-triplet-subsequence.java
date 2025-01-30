class Solution {
    public boolean increasingTriplet(int[] nums) {
        int low = Integer.MAX_VALUE;
        int med = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= low) {
                low = num;
            } else if (num <= med) {
                med = num;
            } else {
                return true;
            }
        }
        return false;
    }
}