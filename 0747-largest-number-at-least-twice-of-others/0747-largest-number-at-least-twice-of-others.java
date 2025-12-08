class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MAX_VALUE;
        int maxIdx = -1;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] > max){
                max2 = max;
                max = nums[i];
                maxIdx = i;
            }else if(nums[i] > max2){
                max2 = nums[i];
            }
        }
        return (max2*2 <= max)? maxIdx : -1;
    }
}