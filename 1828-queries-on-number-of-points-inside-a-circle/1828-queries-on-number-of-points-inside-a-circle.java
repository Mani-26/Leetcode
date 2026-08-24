class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            for (int j = 0; j < points.length; j++) {
                int dx = queries[i][0] - points[j][0];
                int dy = queries[i][1] - points[j][1];
                if (dx * dx + dy * dy <= queries[i][2] * queries[i][2]) {
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }
}