class Solution {
    public int rob(int[] nums) {
        int next1=0;
        int next2=0;
        for(int i=nums.length-1;i>=0;i--){
            int current=Math.max(nums[i]+next2 , next1);
            next2=next1;
            next1=current;
        }
        return next1;
    }
}