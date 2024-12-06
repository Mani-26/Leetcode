class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int sum=0;
        int count=0;
        boolean[] flags = new boolean[10001];
        for (int i : banned) {
            flags[i] = true;
        }
        for(int i=1;i<=n;i++){
            if(!flags[i]&&sum+i<=maxSum){
                sum+=i;
                count++;
            }
        }
        return count;
    }
}