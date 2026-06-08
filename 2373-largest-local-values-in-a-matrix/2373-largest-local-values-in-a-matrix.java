class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int res[][]=new int[n-2][n-2];
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                int lmax=Integer.MIN_VALUE;
                for(int k=i;k<i+3;k++){
                    for(int l=j;l<j+3;l++){
                        lmax=Math.max(lmax,grid[k][l]);
                    }
                }
                res[i][j]=lmax;
            }
        }
        return res;
    }
}