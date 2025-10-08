class Solution {
    public double minimumAverage(int[] nums) {
        int n = nums.length;
        double avg = Double.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<=n/2;i++){
            double temp=(nums[i]+nums[n-i-1])/2.0;
            avg=Math.min(temp,avg);
        }
        return avg;
    }
}