class Solution {
    public long gridGame(int[][] grid) {
        int n=grid[0].length;
        long sum1=0,sum2=0;
        long min =Long.MAX_VALUE;
        for(int i:grid[0]){
            sum1+=i;
        }
        for(int i=0;i<n;i++){
            sum1-=grid[0][i];
            min=Math.min(Math.max(sum1,sum2),min);
            sum2+=grid[1][i];
        }
        return min;
    }
}