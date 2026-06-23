class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;

        for (int i = 0; i < m; i++) {
            mat[i][0] = countSoldiers(mat[i]);
            mat[i][1] = i;
        }

        Arrays.sort(mat, (a, b) -> (a[0] == b[0])?a[1] - b[1]:a[0] - b[0]);

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = mat[i][1];
        }

        return ans;
    }
    
    private int countSoldiers(int[] row) {
        int left = 0;
        int right = row.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (row[mid] == 1) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left; 
    }
}