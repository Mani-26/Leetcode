class Solution {
    public int alternatingSum(int[] nums) {
        int res=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            res+=(i%2==0)?nums[i]:-nums[i];
        }
        return res;
    }
}