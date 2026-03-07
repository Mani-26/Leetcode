class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;//10
        int right = 0;//55
        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canShip(weights, mid, days)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean canShip(int[] weights, int capacity, int days) {
        int usedDays = 1;
        int load = 0;
        for (int weight : weights) {
            if (load + weight > capacity) {
                usedDays++;
                load = 0;
            }
            load += weight;
        }
        return usedDays <= days;
    }
}