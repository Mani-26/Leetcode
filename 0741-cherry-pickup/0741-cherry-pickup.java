class Solution {
    private Integer dp[][][];
    private int n;
    private int grid[][];
    public int cherryPickup(int[][] grid) {
        this.grid=grid;
        n=grid.length;
        dp=new Integer[n][n][n];
        return Math.max(0,dfs(0,0,0));
    }
    int dfs(int r1,int c1, int r2){
        int c2=r1+c1-r2;
        if(r1>=n||c1>=n||r2>=n||c2>=n){
            return -1000000;
        }
        if(grid[r1][c1]==-1 || grid[r2][c2]==-1){
            return -1000000;
        }
        if(r1==n-1 && c1==n-1){
            return grid[r1][c1];
        }
        if(dp[r1][c1][r2]!=null){
            return dp[r1][c1][r2];
        }
        int cherry = grid[r1][c1];
        if(r1!=r2|| c1!=c2){
            cherry +=grid[r2][c2];
        }
        int best=Math.max(
            Math.max(dfs(r1+1,c1,r2+1), dfs(r1+1,c1,r2)),
            Math.max(dfs(r1,c1+1,r2+1), dfs(r1,c1+1,r2))
        );
        cherry+=best;
        dp[r1][c1][r2]=cherry;
        return cherry;
    }
}