class Solution {
    public int maxTwoEvents(int[][] events) {
        List<int[]> al = new ArrayList<>();
        for (int[] arr : events) {
            al.add(new int[] { arr[0], 1, arr[2] });
            al.add(new int[] { arr[1] + 1, 0, arr[2] });
        }
        al.sort((a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));
        int ans = 0, maxValue = 0;
        for (int[] val : al) {
            if (val[1] == 1) {
                ans = Math.max(ans, val[2] + maxValue);
            } else {
                maxValue = Math.max(maxValue, val[2]);
            }
        }
        return ans;
    }
}