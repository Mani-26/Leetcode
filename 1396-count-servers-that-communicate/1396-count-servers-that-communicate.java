class Solution {
    public int countServers(int[][] grid) {
        int total=0;
        int n=grid.length;
        int m=grid[0].length;
        int row[]=new int[n];
        int col[]=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                row[i]+=grid[i][j];
                col[j]+=grid[i][j];
            }
            total+=row[i];
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1&&row[i]==1&&col[j]==1) {
                    total--;
                }
            }
        }
        return total;
    }
}