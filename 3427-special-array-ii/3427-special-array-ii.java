class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n=nums.length;
        int m=queries.length;
        int spl[]=new int[n];
        spl[0]=0;
        for(int i=1;i<n;i++){
            if((nums[i-1]+nums[i])%2==1){
                spl[i]=spl[i-1];
            }
            else{
                spl[i]=spl[i-1]+1;
            }
        }
        boolean res[]=new boolean[m];
        for(int j=0;j<m;j++){
            res[j]=spl[queries[j][0]]==spl[queries[j][1]];
        }
        return res;
    }
}