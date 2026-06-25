class Solution {
    public int maxSubArray(int[] nums) {
        int res=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            max=Math.max(nums[i],max+nums[i]);
            res=Math.max(max,res);
        }
        return res;
    }
}